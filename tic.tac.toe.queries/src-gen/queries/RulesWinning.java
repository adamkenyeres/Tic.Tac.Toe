/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/RulesWinning.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.OWinningDiagonalLeftMatcher;
import queries.OWinningDiagonalRightMatcher;
import queries.OWinningHorizontalMatcher;
import queries.OWinningMatcher;
import queries.OWinningVerticalMatcher;
import queries.XWinningDiagonalLeftMatcher;
import queries.XWinningDiagonalRightMatcher;
import queries.XWinningHorizontalMatcher;
import queries.XWinningMatcher;
import queries.XWinningVerticalMatcher;
import queries.util.OWinningDiagonalLeftQuerySpecification;
import queries.util.OWinningDiagonalRightQuerySpecification;
import queries.util.OWinningHorizontalQuerySpecification;
import queries.util.OWinningQuerySpecification;
import queries.util.OWinningVerticalQuerySpecification;
import queries.util.XWinningDiagonalLeftQuerySpecification;
import queries.util.XWinningDiagonalRightQuerySpecification;
import queries.util.XWinningHorizontalQuerySpecification;
import queries.util.XWinningQuerySpecification;
import queries.util.XWinningVerticalQuerySpecification;

/**
 * A pattern group formed of all patterns defined in RulesWinning.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file RulesWinning.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>XWinningVertical</li>
 * <li>XWinningHorizontal</li>
 * <li>XWinningDiagonalLeft</li>
 * <li>XWinningDiagonalRight</li>
 * <li>OWinningVertical</li>
 * <li>OWinningHorizontal</li>
 * <li>OWinningDiagonalLeft</li>
 * <li>OWinningDiagonalRight</li>
 * <li>XWinning</li>
 * <li>OWinning</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class RulesWinning extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static RulesWinning instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new RulesWinning();
    }
    return INSTANCE;
  }
  
  private static RulesWinning INSTANCE;
  
  private RulesWinning() throws ViatraQueryException {
    querySpecifications.add(XWinningVerticalQuerySpecification.instance());
    querySpecifications.add(XWinningHorizontalQuerySpecification.instance());
    querySpecifications.add(XWinningDiagonalLeftQuerySpecification.instance());
    querySpecifications.add(XWinningDiagonalRightQuerySpecification.instance());
    querySpecifications.add(OWinningVerticalQuerySpecification.instance());
    querySpecifications.add(OWinningHorizontalQuerySpecification.instance());
    querySpecifications.add(OWinningDiagonalLeftQuerySpecification.instance());
    querySpecifications.add(OWinningDiagonalRightQuerySpecification.instance());
    querySpecifications.add(XWinningQuerySpecification.instance());
    querySpecifications.add(OWinningQuerySpecification.instance());
  }
  
  public XWinningVerticalQuerySpecification getXWinningVertical() throws ViatraQueryException {
    return XWinningVerticalQuerySpecification.instance();
  }
  
  public XWinningVerticalMatcher getXWinningVertical(final ViatraQueryEngine engine) throws ViatraQueryException {
    return XWinningVerticalMatcher.on(engine);
  }
  
  public XWinningHorizontalQuerySpecification getXWinningHorizontal() throws ViatraQueryException {
    return XWinningHorizontalQuerySpecification.instance();
  }
  
  public XWinningHorizontalMatcher getXWinningHorizontal(final ViatraQueryEngine engine) throws ViatraQueryException {
    return XWinningHorizontalMatcher.on(engine);
  }
  
  public XWinningDiagonalLeftQuerySpecification getXWinningDiagonalLeft() throws ViatraQueryException {
    return XWinningDiagonalLeftQuerySpecification.instance();
  }
  
  public XWinningDiagonalLeftMatcher getXWinningDiagonalLeft(final ViatraQueryEngine engine) throws ViatraQueryException {
    return XWinningDiagonalLeftMatcher.on(engine);
  }
  
  public XWinningDiagonalRightQuerySpecification getXWinningDiagonalRight() throws ViatraQueryException {
    return XWinningDiagonalRightQuerySpecification.instance();
  }
  
  public XWinningDiagonalRightMatcher getXWinningDiagonalRight(final ViatraQueryEngine engine) throws ViatraQueryException {
    return XWinningDiagonalRightMatcher.on(engine);
  }
  
  public OWinningVerticalQuerySpecification getOWinningVertical() throws ViatraQueryException {
    return OWinningVerticalQuerySpecification.instance();
  }
  
  public OWinningVerticalMatcher getOWinningVertical(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OWinningVerticalMatcher.on(engine);
  }
  
  public OWinningHorizontalQuerySpecification getOWinningHorizontal() throws ViatraQueryException {
    return OWinningHorizontalQuerySpecification.instance();
  }
  
  public OWinningHorizontalMatcher getOWinningHorizontal(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OWinningHorizontalMatcher.on(engine);
  }
  
  public OWinningDiagonalLeftQuerySpecification getOWinningDiagonalLeft() throws ViatraQueryException {
    return OWinningDiagonalLeftQuerySpecification.instance();
  }
  
  public OWinningDiagonalLeftMatcher getOWinningDiagonalLeft(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OWinningDiagonalLeftMatcher.on(engine);
  }
  
  public OWinningDiagonalRightQuerySpecification getOWinningDiagonalRight() throws ViatraQueryException {
    return OWinningDiagonalRightQuerySpecification.instance();
  }
  
  public OWinningDiagonalRightMatcher getOWinningDiagonalRight(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OWinningDiagonalRightMatcher.on(engine);
  }
  
  public XWinningQuerySpecification getXWinning() throws ViatraQueryException {
    return XWinningQuerySpecification.instance();
  }
  
  public XWinningMatcher getXWinning(final ViatraQueryEngine engine) throws ViatraQueryException {
    return XWinningMatcher.on(engine);
  }
  
  public OWinningQuerySpecification getOWinning() throws ViatraQueryException {
    return OWinningQuerySpecification.instance();
  }
  
  public OWinningMatcher getOWinning(final ViatraQueryEngine engine) throws ViatraQueryException {
    return OWinningMatcher.on(engine);
  }
}
