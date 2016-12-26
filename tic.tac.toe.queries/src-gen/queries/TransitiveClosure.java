/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/TransitiveClosure.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.TCEastMatcher;
import queries.TCEastWithEmptyMarksMatcher;
import queries.TCEastWithSameMarksMatcher;
import queries.TCNorhtWestMatcher;
import queries.TCNorthEastMatcher;
import queries.TCNorthEastWithSameMarksMatcher;
import queries.TCNorthMatcher;
import queries.TCNorthWestWithSameMarksMatcher;
import queries.TCNorthWithEmptyMarksMatcher;
import queries.TCNorthWithSameMarksMatcher;
import queries.TCSouthEastMatcher;
import queries.TCSouthEastWithSameMarksMatcher;
import queries.TCSouthMatcher;
import queries.TCSouthWestMatcher;
import queries.TCSouthWestWithSameMarksMatcher;
import queries.TCSouthWithEmptyMarksMatcher;
import queries.TCSouthWithSameMarksMatcher;
import queries.TCWestMatcher;
import queries.TCWestWithEmptyMarksMatcher;
import queries.TCWestWithSameMarksMatcher;
import queries.util.TCEastQuerySpecification;
import queries.util.TCEastWithEmptyMarksQuerySpecification;
import queries.util.TCEastWithSameMarksQuerySpecification;
import queries.util.TCNorhtWestQuerySpecification;
import queries.util.TCNorthEastQuerySpecification;
import queries.util.TCNorthEastWithSameMarksQuerySpecification;
import queries.util.TCNorthQuerySpecification;
import queries.util.TCNorthWestWithSameMarksQuerySpecification;
import queries.util.TCNorthWithEmptyMarksQuerySpecification;
import queries.util.TCNorthWithSameMarksQuerySpecification;
import queries.util.TCSouthEastQuerySpecification;
import queries.util.TCSouthEastWithSameMarksQuerySpecification;
import queries.util.TCSouthQuerySpecification;
import queries.util.TCSouthWestQuerySpecification;
import queries.util.TCSouthWestWithSameMarksQuerySpecification;
import queries.util.TCSouthWithEmptyMarksQuerySpecification;
import queries.util.TCSouthWithSameMarksQuerySpecification;
import queries.util.TCWestQuerySpecification;
import queries.util.TCWestWithEmptyMarksQuerySpecification;
import queries.util.TCWestWithSameMarksQuerySpecification;

/**
 * A pattern group formed of all patterns defined in TransitiveClosure.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file TransitiveClosure.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>TCNorth</li>
 * <li>TCSouth</li>
 * <li>TCEast</li>
 * <li>TCWest</li>
 * <li>TCNorhtWest</li>
 * <li>TCSouthWest</li>
 * <li>TCNorthEast</li>
 * <li>TCSouthEast</li>
 * <li>TCNorthWithSameMarks</li>
 * <li>TCNorthEastWithSameMarks</li>
 * <li>TCEastWithSameMarks</li>
 * <li>TCSouthEastWithSameMarks</li>
 * <li>TCSouthWithSameMarks</li>
 * <li>TCSouthWestWithSameMarks</li>
 * <li>TCWestWithSameMarks</li>
 * <li>TCNorthWestWithSameMarks</li>
 * <li>TCNorthWithEmptyMarks</li>
 * <li>TCSouthWithEmptyMarks</li>
 * <li>TCEastWithEmptyMarks</li>
 * <li>TCWestWithEmptyMarks</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class TransitiveClosure extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TransitiveClosure instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new TransitiveClosure();
    }
    return INSTANCE;
  }
  
  private static TransitiveClosure INSTANCE;
  
  private TransitiveClosure() throws ViatraQueryException {
    querySpecifications.add(TCNorthQuerySpecification.instance());
    querySpecifications.add(TCSouthQuerySpecification.instance());
    querySpecifications.add(TCEastQuerySpecification.instance());
    querySpecifications.add(TCWestQuerySpecification.instance());
    querySpecifications.add(TCNorhtWestQuerySpecification.instance());
    querySpecifications.add(TCSouthWestQuerySpecification.instance());
    querySpecifications.add(TCNorthEastQuerySpecification.instance());
    querySpecifications.add(TCSouthEastQuerySpecification.instance());
    querySpecifications.add(TCNorthWithSameMarksQuerySpecification.instance());
    querySpecifications.add(TCNorthEastWithSameMarksQuerySpecification.instance());
    querySpecifications.add(TCEastWithSameMarksQuerySpecification.instance());
    querySpecifications.add(TCSouthEastWithSameMarksQuerySpecification.instance());
    querySpecifications.add(TCSouthWithSameMarksQuerySpecification.instance());
    querySpecifications.add(TCSouthWestWithSameMarksQuerySpecification.instance());
    querySpecifications.add(TCWestWithSameMarksQuerySpecification.instance());
    querySpecifications.add(TCNorthWestWithSameMarksQuerySpecification.instance());
    querySpecifications.add(TCNorthWithEmptyMarksQuerySpecification.instance());
    querySpecifications.add(TCSouthWithEmptyMarksQuerySpecification.instance());
    querySpecifications.add(TCEastWithEmptyMarksQuerySpecification.instance());
    querySpecifications.add(TCWestWithEmptyMarksQuerySpecification.instance());
  }
  
  public TCNorthQuerySpecification getTCNorth() throws ViatraQueryException {
    return TCNorthQuerySpecification.instance();
  }
  
  public TCNorthMatcher getTCNorth(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCNorthMatcher.on(engine);
  }
  
  public TCSouthQuerySpecification getTCSouth() throws ViatraQueryException {
    return TCSouthQuerySpecification.instance();
  }
  
  public TCSouthMatcher getTCSouth(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCSouthMatcher.on(engine);
  }
  
  public TCEastQuerySpecification getTCEast() throws ViatraQueryException {
    return TCEastQuerySpecification.instance();
  }
  
  public TCEastMatcher getTCEast(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCEastMatcher.on(engine);
  }
  
  public TCWestQuerySpecification getTCWest() throws ViatraQueryException {
    return TCWestQuerySpecification.instance();
  }
  
  public TCWestMatcher getTCWest(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCWestMatcher.on(engine);
  }
  
  public TCNorhtWestQuerySpecification getTCNorhtWest() throws ViatraQueryException {
    return TCNorhtWestQuerySpecification.instance();
  }
  
  public TCNorhtWestMatcher getTCNorhtWest(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCNorhtWestMatcher.on(engine);
  }
  
  public TCSouthWestQuerySpecification getTCSouthWest() throws ViatraQueryException {
    return TCSouthWestQuerySpecification.instance();
  }
  
  public TCSouthWestMatcher getTCSouthWest(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCSouthWestMatcher.on(engine);
  }
  
  public TCNorthEastQuerySpecification getTCNorthEast() throws ViatraQueryException {
    return TCNorthEastQuerySpecification.instance();
  }
  
  public TCNorthEastMatcher getTCNorthEast(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCNorthEastMatcher.on(engine);
  }
  
  public TCSouthEastQuerySpecification getTCSouthEast() throws ViatraQueryException {
    return TCSouthEastQuerySpecification.instance();
  }
  
  public TCSouthEastMatcher getTCSouthEast(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCSouthEastMatcher.on(engine);
  }
  
  public TCNorthWithSameMarksQuerySpecification getTCNorthWithSameMarks() throws ViatraQueryException {
    return TCNorthWithSameMarksQuerySpecification.instance();
  }
  
  public TCNorthWithSameMarksMatcher getTCNorthWithSameMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCNorthWithSameMarksMatcher.on(engine);
  }
  
  public TCNorthEastWithSameMarksQuerySpecification getTCNorthEastWithSameMarks() throws ViatraQueryException {
    return TCNorthEastWithSameMarksQuerySpecification.instance();
  }
  
  public TCNorthEastWithSameMarksMatcher getTCNorthEastWithSameMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCNorthEastWithSameMarksMatcher.on(engine);
  }
  
  public TCEastWithSameMarksQuerySpecification getTCEastWithSameMarks() throws ViatraQueryException {
    return TCEastWithSameMarksQuerySpecification.instance();
  }
  
  public TCEastWithSameMarksMatcher getTCEastWithSameMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCEastWithSameMarksMatcher.on(engine);
  }
  
  public TCSouthEastWithSameMarksQuerySpecification getTCSouthEastWithSameMarks() throws ViatraQueryException {
    return TCSouthEastWithSameMarksQuerySpecification.instance();
  }
  
  public TCSouthEastWithSameMarksMatcher getTCSouthEastWithSameMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCSouthEastWithSameMarksMatcher.on(engine);
  }
  
  public TCSouthWithSameMarksQuerySpecification getTCSouthWithSameMarks() throws ViatraQueryException {
    return TCSouthWithSameMarksQuerySpecification.instance();
  }
  
  public TCSouthWithSameMarksMatcher getTCSouthWithSameMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCSouthWithSameMarksMatcher.on(engine);
  }
  
  public TCSouthWestWithSameMarksQuerySpecification getTCSouthWestWithSameMarks() throws ViatraQueryException {
    return TCSouthWestWithSameMarksQuerySpecification.instance();
  }
  
  public TCSouthWestWithSameMarksMatcher getTCSouthWestWithSameMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCSouthWestWithSameMarksMatcher.on(engine);
  }
  
  public TCWestWithSameMarksQuerySpecification getTCWestWithSameMarks() throws ViatraQueryException {
    return TCWestWithSameMarksQuerySpecification.instance();
  }
  
  public TCWestWithSameMarksMatcher getTCWestWithSameMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCWestWithSameMarksMatcher.on(engine);
  }
  
  public TCNorthWestWithSameMarksQuerySpecification getTCNorthWestWithSameMarks() throws ViatraQueryException {
    return TCNorthWestWithSameMarksQuerySpecification.instance();
  }
  
  public TCNorthWestWithSameMarksMatcher getTCNorthWestWithSameMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCNorthWestWithSameMarksMatcher.on(engine);
  }
  
  public TCNorthWithEmptyMarksQuerySpecification getTCNorthWithEmptyMarks() throws ViatraQueryException {
    return TCNorthWithEmptyMarksQuerySpecification.instance();
  }
  
  public TCNorthWithEmptyMarksMatcher getTCNorthWithEmptyMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCNorthWithEmptyMarksMatcher.on(engine);
  }
  
  public TCSouthWithEmptyMarksQuerySpecification getTCSouthWithEmptyMarks() throws ViatraQueryException {
    return TCSouthWithEmptyMarksQuerySpecification.instance();
  }
  
  public TCSouthWithEmptyMarksMatcher getTCSouthWithEmptyMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCSouthWithEmptyMarksMatcher.on(engine);
  }
  
  public TCEastWithEmptyMarksQuerySpecification getTCEastWithEmptyMarks() throws ViatraQueryException {
    return TCEastWithEmptyMarksQuerySpecification.instance();
  }
  
  public TCEastWithEmptyMarksMatcher getTCEastWithEmptyMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCEastWithEmptyMarksMatcher.on(engine);
  }
  
  public TCWestWithEmptyMarksQuerySpecification getTCWestWithEmptyMarks() throws ViatraQueryException {
    return TCWestWithEmptyMarksQuerySpecification.instance();
  }
  
  public TCWestWithEmptyMarksMatcher getTCWestWithEmptyMarks(final ViatraQueryEngine engine) throws ViatraQueryException {
    return TCWestWithEmptyMarksMatcher.on(engine);
  }
}
