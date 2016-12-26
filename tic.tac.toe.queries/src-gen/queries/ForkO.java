/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/ForkO.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.OForkMatcher;
import queries.util.OForkQuerySpecification;

/**
 * A pattern group formed of all patterns defined in ForkO.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ForkO.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>OFork</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class ForkO extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ForkO instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new ForkO();
    }
    return INSTANCE;
  }
  
  private static ForkO INSTANCE;
  
  private ForkO() throws ViatraQueryException {
    querySpecifications.add(OForkQuerySpecification.instance());
  }
  
  public OForkQuerySpecification getOFork() throws ViatraQueryException {
    return OForkQuerySpecification.instance();
  }
  
  public OForkMatcher getOFork(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OForkMatcher.on(engine);
  }
}
