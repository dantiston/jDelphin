package net.delphin.jdelphin.processors;


import java.io.IOException;

import net.delphin.jdelphin.processors.impl.Ace;


public class AceTest extends ProcessorTest {

	@Override
	protected Processor getProcessor() throws IOException {
		return new Ace("/Users/admin/Code/github/jDelphin/jDelphin/src/test/resources/net/delphin/jdelphin/processors/eng.dat", "/Applications/ace/ace");
	}

}
