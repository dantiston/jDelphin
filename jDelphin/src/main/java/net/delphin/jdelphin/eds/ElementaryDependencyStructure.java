package net.delphin.jdelphin.eds;


import java.util.Set;


/**
 * ElementaryDependencyStructure<br>
 * <br>
 * Basic definition of an elementary dependency structure
 *
 * @author trimblet
 * @since Feb 16, 2016
 * @version 0.1
 * @see <a
 *      href="http://moin.delph-in.net/EdsTop">http://moin.delph-in.net/EdsTop</a>
 */
public interface ElementaryDependencyStructure {

	public DependencyNode getRoot();


	public Set<DependencyNode> getNodes();

}
