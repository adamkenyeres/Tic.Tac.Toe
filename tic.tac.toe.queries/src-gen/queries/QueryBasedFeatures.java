/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
 */
package queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.EMatcher;
import queries.EastMatcher;
import queries.MarkMatcher;
import queries.MarkOnSquareMatcher;
import queries.NEMatcher;
import queries.NMatcher;
import queries.NWMatcher;
import queries.NorthMatcher;
import queries.SEMatcher;
import queries.SMatcher;
import queries.SWMatcher;
import queries.SouthEastMatcher;
import queries.SouthWestMatcher;
import queries.SquareMatcher;
import queries.WMatcher;
import queries.util.EQuerySpecification;
import queries.util.EastQuerySpecification;
import queries.util.MarkOnSquareQuerySpecification;
import queries.util.MarkQuerySpecification;
import queries.util.NEQuerySpecification;
import queries.util.NQuerySpecification;
import queries.util.NWQuerySpecification;
import queries.util.NorthQuerySpecification;
import queries.util.SEQuerySpecification;
import queries.util.SQuerySpecification;
import queries.util.SWQuerySpecification;
import queries.util.SouthEastQuerySpecification;
import queries.util.SouthWestQuerySpecification;
import queries.util.SquareQuerySpecification;
import queries.util.WQuerySpecification;

/**
 * A pattern group formed of all patterns defined in QueryBasedFeatures.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file QueryBasedFeatures.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package queries, the group contains the definition of the following patterns: <ul>
 * <li>North</li>
 * <li>East</li>
 * <li>SouthEast</li>
 * <li>SouthWest</li>
 * <li>markOnSquare</li>
 * <li>E</li>
 * <li>NE</li>
 * <li>N</li>
 * <li>NW</li>
 * <li>W</li>
 * <li>SW</li>
 * <li>S</li>
 * <li>SE</li>
 * <li>square</li>
 * <li>mark</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class QueryBasedFeatures extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static QueryBasedFeatures instance() throws ViatraQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new QueryBasedFeatures();
    }
    return INSTANCE;
  }
  
  private static QueryBasedFeatures INSTANCE;
  
  private QueryBasedFeatures() throws ViatraQueryException {
    querySpecifications.add(NorthQuerySpecification.instance());
    querySpecifications.add(EastQuerySpecification.instance());
    querySpecifications.add(SouthEastQuerySpecification.instance());
    querySpecifications.add(SouthWestQuerySpecification.instance());
    querySpecifications.add(MarkOnSquareQuerySpecification.instance());
    querySpecifications.add(EQuerySpecification.instance());
    querySpecifications.add(NEQuerySpecification.instance());
    querySpecifications.add(NQuerySpecification.instance());
    querySpecifications.add(NWQuerySpecification.instance());
    querySpecifications.add(WQuerySpecification.instance());
    querySpecifications.add(SWQuerySpecification.instance());
    querySpecifications.add(SQuerySpecification.instance());
    querySpecifications.add(SEQuerySpecification.instance());
    querySpecifications.add(SquareQuerySpecification.instance());
    querySpecifications.add(MarkQuerySpecification.instance());
  }
  
  public NorthQuerySpecification getNorth() throws ViatraQueryException {
    return NorthQuerySpecification.instance();
  }
  
  public NorthMatcher getNorth(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NorthMatcher.on(engine);
  }
  
  public EastQuerySpecification getEast() throws ViatraQueryException {
    return EastQuerySpecification.instance();
  }
  
  public EastMatcher getEast(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EastMatcher.on(engine);
  }
  
  public SouthEastQuerySpecification getSouthEast() throws ViatraQueryException {
    return SouthEastQuerySpecification.instance();
  }
  
  public SouthEastMatcher getSouthEast(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SouthEastMatcher.on(engine);
  }
  
  public SouthWestQuerySpecification getSouthWest() throws ViatraQueryException {
    return SouthWestQuerySpecification.instance();
  }
  
  public SouthWestMatcher getSouthWest(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SouthWestMatcher.on(engine);
  }
  
  public MarkOnSquareQuerySpecification getMarkOnSquare() throws ViatraQueryException {
    return MarkOnSquareQuerySpecification.instance();
  }
  
  public MarkOnSquareMatcher getMarkOnSquare(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MarkOnSquareMatcher.on(engine);
  }
  
  public EQuerySpecification getE() throws ViatraQueryException {
    return EQuerySpecification.instance();
  }
  
  public EMatcher getE(final ViatraQueryEngine engine) throws ViatraQueryException {
    return EMatcher.on(engine);
  }
  
  public NEQuerySpecification getNE() throws ViatraQueryException {
    return NEQuerySpecification.instance();
  }
  
  public NEMatcher getNE(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NEMatcher.on(engine);
  }
  
  public NQuerySpecification getN() throws ViatraQueryException {
    return NQuerySpecification.instance();
  }
  
  public NMatcher getN(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NMatcher.on(engine);
  }
  
  public NWQuerySpecification getNW() throws ViatraQueryException {
    return NWQuerySpecification.instance();
  }
  
  public NWMatcher getNW(final ViatraQueryEngine engine) throws ViatraQueryException {
    return NWMatcher.on(engine);
  }
  
  public WQuerySpecification getW() throws ViatraQueryException {
    return WQuerySpecification.instance();
  }
  
  public WMatcher getW(final ViatraQueryEngine engine) throws ViatraQueryException {
    return WMatcher.on(engine);
  }
  
  public SWQuerySpecification getSW() throws ViatraQueryException {
    return SWQuerySpecification.instance();
  }
  
  public SWMatcher getSW(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SWMatcher.on(engine);
  }
  
  public SQuerySpecification getS() throws ViatraQueryException {
    return SQuerySpecification.instance();
  }
  
  public SMatcher getS(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SMatcher.on(engine);
  }
  
  public SEQuerySpecification getSE() throws ViatraQueryException {
    return SEQuerySpecification.instance();
  }
  
  public SEMatcher getSE(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SEMatcher.on(engine);
  }
  
  public SquareQuerySpecification getSquare() throws ViatraQueryException {
    return SquareQuerySpecification.instance();
  }
  
  public SquareMatcher getSquare(final ViatraQueryEngine engine) throws ViatraQueryException {
    return SquareMatcher.on(engine);
  }
  
  public MarkQuerySpecification getMark() throws ViatraQueryException {
    return MarkQuerySpecification.instance();
  }
  
  public MarkMatcher getMark(final ViatraQueryEngine engine) throws ViatraQueryException {
    return MarkMatcher.on(engine);
  }
}
