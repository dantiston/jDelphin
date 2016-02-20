package net.delphin.jdelphin.processors;


import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import net.delphin.jdelphin.derivation.Derivation;
import net.delphin.jdelphin.mrs.MinimalRecursionSemantics;
import net.delphin.jdelphin.obj.Parse;

import org.junit.Test;


/**
 * Processor<br>
 * <br>
 *
 *
 * @author trimblet
 * @since Feb 20, 2016
 * @version 0.1
 */
public abstract class ProcessorTest {

	private static final String TEST_STRING = "I sleep.";
	private static final String TEST_MRS_SERIALIZATION = "";
	private static final String TEST_DERIVATION_SERIALIZATION = "";
	private static final MinimalRecursionSemantics TEST_MRS = null;
	private static final Derivation TEST_DERIVATION = null;


	protected abstract Processor getProcessor() throws IOException;


	@Test
	public void testParse() throws IOException {
		List<Parse> result = this.getProcessor().parse(TEST_STRING);
		assertEquals(1, result.size());
		Parse parse = result.get(0);
		assertEquals(TEST_MRS, parse.getMrs());
		assertEquals(TEST_DERIVATION, parse.getDerivation());
	}
}
