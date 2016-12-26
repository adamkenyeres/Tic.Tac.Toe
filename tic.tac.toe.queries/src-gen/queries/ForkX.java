/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/ForkX.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.XForkMatcher;
import queries.util.XForkQuerySpecification;

/**
 * A pattern group formed of all patterns defined in ForkX.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ForkX.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>XFork</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class ForkX extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ForkX instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new ForkX();
    }
    return INSTANCE;
  }
  
  private static ForkX INSTANCE;
  
  private ForkX() throws ViatraQueryException {
    querySpecifications.add(XForkQuerySpecification.instance());
  }
  
  public XForkQuerySpecification getXFork() throws ViatraQueryException {
    return XForkQuerySpecification.instance();
  }
  
  public XForkMatcher getXFork(final ViatraQueryEngine engine) throws ViatraQueryException {
    return XForkMatcher.on(engine);
  }
}
