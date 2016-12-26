/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/Rules.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.OMovesMatcher;
import queries.XMovesMatcher;
import queries.util.OMovesQuerySpecification;
import queries.util.XMovesQuerySpecification;

/**
 * A pattern group formed of all patterns defined in Rules.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Rules.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>XMoves</li>
 * <li>OMoves</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Rules extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Rules instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Rules();
    }
    return INSTANCE;
  }
  
  private static Rules INSTANCE;
  
  private Rules() throws ViatraQueryException {
    querySpecifications.add(XMovesQuerySpecification.instance());
    querySpecifications.add(OMovesQuerySpecification.instance());
  }
  
  public XMovesQuerySpecification getXMoves() throws ViatraQueryException {
    return XMovesQuerySpecification.instance();
  }
  
  public XMovesMatcher getXMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return XMovesMatcher.on(engine);
  }
  
  public OMovesQuerySpecification getOMoves() throws ViatraQueryException {
    return OMovesQuerySpecification.instance();
  }
  
  public OMovesMatcher getOMoves(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OMovesMatcher.on(engine);
  }
}
