package net.delphin.jdelphin.mrs.components.impl;


import java.util.Map;

import net.delphin.jdelphin.mrs.components.Feature;
import net.delphin.jdelphin.mrs.components.Handle;


/**
 * BasicHandle<br>
 * <br>
 * Basic implementation of the {@link Handle} interface.
 *
 * @author trimblet
 * @since Feb 15, 2016
 * @version 0.1
 */
public class BasicHandle extends BasicVariable implements Handle {

	public BasicHandle(Integer id) {
		super(Type.HANDLE, id);
	}


	public BasicHandle(Integer id, Map<Feature, String> features) {
		super(Type.HANDLE, id, features);
	}

}
