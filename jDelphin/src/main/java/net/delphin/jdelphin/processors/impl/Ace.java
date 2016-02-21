package net.delphin.jdelphin.processors.impl;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import net.delphin.jdelphin.derivation.Derivation;
import net.delphin.jdelphin.lui.AbstractLuiProcessor;
import net.delphin.jdelphin.mrs.MinimalRecursionSemantics;
import net.delphin.jdelphin.processors.Processor;


/**
 * Ace<br>
 * <br>
 * Wrapper around an Ace process.
 *
 * @author trimblet
 * @since Feb 20, 2016
 * @version 0.1
 * @see <a href=""></a>
 */
public class Ace extends AbstractLuiProcessor {

	/*
	 * # CONDITIONS
	 * ## HEADER
	 * # 0: PARSE X -> Skip this line
	 * # 1: GROUP X -> Get the parse count (X)
	 * # 2: SKIP: -> no parses, return
	 * # 3: LUI: unknown X -> no parses, return
	 * # 4: <error> -> raise error
	 * # 5: timeout -> raise error
	 * ## PARSES
	 * # 0: tree X -> Get the tree ID, top node ID, load tree into data, get MRS
	 * # 1: LUI: unknown X -> no parses, return
	 * # 2: EOF -> n parses, return
	 * # 3: timeout -> raise error
	 */

	private static final String DEFAULT_EXECUTABLE = "ace";
	private static final List<String> HEADER_TAGS = Collections.unmodifiableList(Arrays.asList("parse .*?\r\n", "group .*?\r\n", "SKIP: .*?\r\n", "LUI: unknown .*\r\n"));
	private static final List<String> RESULT_TAGS = Collections.unmodifiableList(Arrays.asList("tree .*?\r\n", "LUI: unknown .*?\r\n"));
	private static final String ACE_HEADER = "(parameter .*\r\n)*ACE: reading input from LUI\r\n";
	private static final String[] COMMANDS = new String[] { "", "-l", "--lui-fd=3", "--input-from-lui", "-g", "" };

	private final String grammarUrl;
	private final String executable;
	// private final Process process;
	private final ProcessBuilder processBuilder;


	public Ace(String grammarUrl) throws IOException {
		this(grammarUrl, DEFAULT_EXECUTABLE);
	}


	/**
	 * Construct an {@link Ace} instance.
	 *
	 * @param grammarUrl
	 * @param executable
	 * @throws IOException
	 */
	public Ace(String grammarUrl, String executable) throws IOException {
		if (grammarUrl == null || executable == null) {
			throw new NullPointerException("Ace#() passed null parameter");
		}
		if (grammarUrl.isEmpty() || executable.isEmpty()) {
			throw new IllegalArgumentException("Ace#() passed illegally empty parameter");
		}
		this.grammarUrl = grammarUrl;
		this.executable = executable;

		ProcessBuilder process = new ProcessBuilder();
		String[] commands = COMMANDS.clone();
		commands[0] = executable;
		commands[COMMANDS.length - 1] = grammarUrl;
		process.command(commands);
		this.processBuilder = process;

		// this.process = process.start();
	}


	@Override
	public List<String> doParse(String string) throws IOException, InterruptedException {
		List<String> result = Collections.emptyList();
		Process process = this.processBuilder.start();
		try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(process.getOutputStream()))) {
			// Send the request
			writer.write(string);
			writer.flush();
			process.waitFor();
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
				// Receive the results
				result = new ArrayList<String>(10);
				String line;
				while ((line = reader.readLine()) != null) {
					System.out.println("Line: " + line);
					result.add(line);
				}
			}
		}
		process.destroy();
		if (process.isAlive()) {
			process.destroyForcibly();
		}
		return result;
	}


	@Override
	public List<String> requestMrs(List<? extends Derivation> derivations) {
		return Collections.emptyList(); // TODO: THIS
	}


	@Override
	public List<String> generate(MinimalRecursionSemantics mrs) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MinimalRecursionSemantics> transfer(MinimalRecursionSemantics mrs, Processor otherGrammar) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getLoadedGrammarPath() {
		return this.grammarUrl;
	}


	@Override
	public void shutDown() {
		// // this.process.getOutputStream()
		// if (this.process.isAlive()) {
		// this.process.destroy();
		// }
		// if (this.process.isAlive()) {
		// this.process.destroyForcibly();
		// }
	}
}
