/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/BasicRules.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.EmptySidesMatcher;
import queries.MarkCenterMatcher;
import queries.OppositeXCornerMatcher;
import queries.util.EmptySidesQuerySpecification;
import queries.util.MarkCenterQuerySpecification;
import queries.util.OppositeXCornerQuerySpecification;

/**
 * A pattern group formed of all patterns defined in BasicRules.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file BasicRules.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>markCenter</li>
 * <li>oppositeXCorner</li>
 * <li>emptySides</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class BasicRules extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static BasicRules instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new BasicRules();
    }
    return INSTANCE;
  }
  
  private static BasicRules INSTANCE;
  
  private BasicRules() throws ViatraQueryException {
    querySpecifications.add(MarkCenterQuerySpecification.instance());
    querySpecifications.add(OppositeXCornerQuerySpecification.instance());
    querySpecifications.add(EmptySidesQuerySpecification.instance());
  }
  
  public MarkCenterQuerySpecification getMarkCenter() throws ViatraQueryException {
    return MarkCenterQuerySpecification.instance();
  }
  
  public MarkCenterMatcher getMarkCenter(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MarkCenterMatcher.on(engine);
  }
  
  public OppositeXCornerQuerySpecification getOppositeXCorner() throws ViatraQueryException {
    return OppositeXCornerQuerySpecification.instance();
  }
  
  public OppositeXCornerMatcher getOppositeXCorner(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OppositeXCornerMatcher.on(engine);
  }
  
  public EmptySidesQuerySpecification getEmptySides() throws ViatraQueryException {
    return EmptySidesQuerySpecification.instance();
  }
  
  public EmptySidesMatcher getEmptySides(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EmptySidesMatcher.on(engine);
  }
}
