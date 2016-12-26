/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/TwoMovesFromWinning.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.CornersMatcher;
import queries.ForceOWinMatcher;
import queries.OTwoMovesFromWinningDiagonalLeftMatcher;
import queries.OTwoMovesFromWinningDiagonalRightMatcher;
import queries.OTwoMovesFromWinningHorizontalMatcher;
import queries.OTwoMovesFromWinningMatcher;
import queries.OTwoMovesFromWinningVerticalMatcher;
import queries.PreventXForkByForcingWinMatcher;
import queries.util.CornersQuerySpecification;
import queries.util.ForceOWinQuerySpecification;
import queries.util.OTwoMovesFromWinningDiagonalLeftQuerySpecification;
import queries.util.OTwoMovesFromWinningDiagonalRightQuerySpecification;
import queries.util.OTwoMovesFromWinningHorizontalQuerySpecification;
import queries.util.OTwoMovesFromWinningQuerySpecification;
import queries.util.OTwoMovesFromWinningVerticalQuerySpecification;
import queries.util.PreventXForkByForcingWinQuerySpecification;

/**
 * A pattern group formed of all patterns defined in TwoMovesFromWinning.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file TwoMovesFromWinning.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>OTwoMovesFromWinningVertical</li>
 * <li>OTwoMovesFromWinningHorizontal</li>
 * <li>OTwoMovesFromWinningDiagonalLeft</li>
 * <li>OTwoMovesFromWinningDiagonalRight</li>
 * <li>oTwoMovesFromWinning</li>
 * <li>forceOWin</li>
 * <li>corners</li>
 * <li>preventXForkByForcingWin</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class TwoMovesFromWinning extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TwoMovesFromWinning instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new TwoMovesFromWinning();
    }
    return INSTANCE;
  }
  
  private static TwoMovesFromWinning INSTANCE;
  
  private TwoMovesFromWinning() throws ViatraQueryException {
    querySpecifications.add(OTwoMovesFromWinningVerticalQuerySpecification.instance());
    querySpecifications.add(OTwoMovesFromWinningHorizontalQuerySpecification.instance());
    querySpecifications.add(OTwoMovesFromWinningDiagonalLeftQuerySpecification.instance());
    querySpecifications.add(OTwoMovesFromWinningDiagonalRightQuerySpecification.instance());
    querySpecifications.add(OTwoMovesFromWinningQuerySpecification.instance());
    querySpecifications.add(ForceOWinQuerySpecification.instance());
    querySpecifications.add(CornersQuerySpecification.instance());
    querySpecifications.add(PreventXForkByForcingWinQuerySpecification.instance());
  }
  
  public OTwoMovesFromWinningVerticalQuerySpecification getOTwoMovesFromWinningVertical() throws ViatraQueryException {
    return OTwoMovesFromWinningVerticalQuerySpecification.instance();
  }
  
  public OTwoMovesFromWinningVerticalMatcher getOTwoMovesFromWinningVertical(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OTwoMovesFromWinningVerticalMatcher.on(engine);
  }
  
  public OTwoMovesFromWinningHorizontalQuerySpecification getOTwoMovesFromWinningHorizontal() throws ViatraQueryException {
    return OTwoMovesFromWinningHorizontalQuerySpecification.instance();
  }
  
  public OTwoMovesFromWinningHorizontalMatcher getOTwoMovesFromWinningHorizontal(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OTwoMovesFromWinningHorizontalMatcher.on(engine);
  }
  
  public OTwoMovesFromWinningDiagonalLeftQuerySpecification getOTwoMovesFromWinningDiagonalLeft() throws ViatraQueryException {
    return OTwoMovesFromWinningDiagonalLeftQuerySpecification.instance();
  }
  
  public OTwoMovesFromWinningDiagonalLeftMatcher getOTwoMovesFromWinningDiagonalLeft(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OTwoMovesFromWinningDiagonalLeftMatcher.on(engine);
  }
  
  public OTwoMovesFromWinningDiagonalRightQuerySpecification getOTwoMovesFromWinningDiagonalRight() throws ViatraQueryException {
    return OTwoMovesFromWinningDiagonalRightQuerySpecification.instance();
  }
  
  public OTwoMovesFromWinningDiagonalRightMatcher getOTwoMovesFromWinningDiagonalRight(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OTwoMovesFromWinningDiagonalRightMatcher.on(engine);
  }
  
  public OTwoMovesFromWinningQuerySpecification getOTwoMovesFromWinning() throws ViatraQueryException {
    return OTwoMovesFromWinningQuerySpecification.instance();
  }
  
  public OTwoMovesFromWinningMatcher getOTwoMovesFromWinning(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OTwoMovesFromWinningMatcher.on(engine);
  }
  
  public ForceOWinQuerySpecification getForceOWin() throws ViatraQueryException {
    return ForceOWinQuerySpecification.instance();
  }
  
  public ForceOWinMatcher getForceOWin(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ForceOWinMatcher.on(engine);
  }
  
  public CornersQuerySpecification getCorners() throws ViatraQueryException {
    return CornersQuerySpecification.instance();
  }
  
  public CornersMatcher getCorners(final ViatraQueryEngine engine) throws ViatraQueryException {
    return CornersMatcher.on(engine);
  }
  
  public PreventXForkByForcingWinQuerySpecification getPreventXForkByForcingWin() throws ViatraQueryException {
    return PreventXForkByForcingWinQuerySpecification.instance();
  }
  
  public PreventXForkByForcingWinMatcher getPreventXForkByForcingWin(final ViatraQueryEngine engine) throws ViatraQueryException {
    return PreventXForkByForcingWinMatcher.on(engine);
  }
}
