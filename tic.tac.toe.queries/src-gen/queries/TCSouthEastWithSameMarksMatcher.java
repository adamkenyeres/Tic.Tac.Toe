/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/TransitiveClosure.vql
 */
package queries;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import queries.TCSouthEastWithSameMarksMatch;
import queries.util.TCSouthEastWithSameMarksQuerySpecification;
import tictactoe.Color;
import tictactoe.Square;

/**
 * Generated pattern matcher API of the queries.TCSouthEastWithSameMarks pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TCSouthEastWithSameMarksMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern TCSouthEastWithSameMarks(s1 : Square, s2 : Square, color : Color) {
 * 	find SE +(s1, s2);
 * 	find markOnSquare(mark, s2, _);
 * 	Mark.color(mark, color);
 * }
 * </pre></code>
 * 
 * @see TCSouthEastWithSameMarksMatch
 * @see TCSouthEastWithSameMarksProcessor
 * @see TCSouthEastWithSameMarksQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TCSouthEastWithSameMarksMatcher extends BaseMatcher<TCSouthEastWithSameMarksMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TCSouthEastWithSameMarksMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    TCSouthEastWithSameMarksMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (TCSouthEastWithSameMarksMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TCSouthEastWithSameMarksMatcher create() throws ViatraQueryException {
    return new TCSouthEastWithSameMarksMatcher();
  }
  
  private final static int POSITION_S1 = 0;
  
  private final static int POSITION_S2 = 1;
  
  private final static int POSITION_COLOR = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(TCSouthEastWithSameMarksMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private TCSouthEastWithSameMarksMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return matches represented as a TCSouthEastWithSameMarksMatch object.
   * 
   */
  public Collection<TCSouthEastWithSameMarksMatch> getAllMatches(final Square pS1, final Square pS2, final Color pColor) {
    return rawGetAllMatches(new Object[]{pS1, pS2, pColor});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return a match represented as a TCSouthEastWithSameMarksMatch object, or null if no match is found.
   * 
   */
  public TCSouthEastWithSameMarksMatch getOneArbitraryMatch(final Square pS1, final Square pS2, final Color pColor) {
    return rawGetOneArbitraryMatch(new Object[]{pS1, pS2, pColor});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pS1, final Square pS2, final Color pColor) {
    return rawHasMatch(new Object[]{pS1, pS2, pColor});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pS1, final Square pS2, final Color pColor) {
    return rawCountMatches(new Object[]{pS1, pS2, pColor});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pS1, final Square pS2, final Color pColor, final IMatchProcessor<? super TCSouthEastWithSameMarksMatch> processor) {
    rawForEachMatch(new Object[]{pS1, pS2, pColor}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pS1, final Square pS2, final Color pColor, final IMatchProcessor<? super TCSouthEastWithSameMarksMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pS1, pS2, pColor}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pS1 the fixed value of pattern parameter s1, or null if not bound.
   * @param pS2 the fixed value of pattern parameter s2, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public TCSouthEastWithSameMarksMatch newMatch(final Square pS1, final Square pS2, final Color pColor) {
    return TCSouthEastWithSameMarksMatch.newMatch(pS1, pS2, pColor);
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfs1(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_S1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs1() {
    return rawAccumulateAllValuesOfs1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs1(final TCSouthEastWithSameMarksMatch partialMatch) {
    return rawAccumulateAllValuesOfs1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs1(final Square pS2, final Color pColor) {
    return rawAccumulateAllValuesOfs1(new Object[]{
    null, 
    pS2, 
    pColor
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfs2(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_S2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs2() {
    return rawAccumulateAllValuesOfs2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs2(final TCSouthEastWithSameMarksMatch partialMatch) {
    return rawAccumulateAllValuesOfs2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for s2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfs2(final Square pS1, final Color pColor) {
    return rawAccumulateAllValuesOfs2(new Object[]{
    pS1, 
    null, 
    pColor
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for color.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Color> rawAccumulateAllValuesOfcolor(final Object[] parameters) {
    Set<Color> results = new HashSet<Color>();
    rawAccumulateAllValues(POSITION_COLOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for color.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Color> getAllValuesOfcolor() {
    return rawAccumulateAllValuesOfcolor(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for color.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Color> getAllValuesOfcolor(final TCSouthEastWithSameMarksMatch partialMatch) {
    return rawAccumulateAllValuesOfcolor(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for color.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Color> getAllValuesOfcolor(final Square pS1, final Square pS2) {
    return rawAccumulateAllValuesOfcolor(new Object[]{
    pS1, 
    pS2, 
    null
    });
  }
  
  @Override
  protected TCSouthEastWithSameMarksMatch tupleToMatch(final Tuple t) {
    try {
    	return TCSouthEastWithSameMarksMatch.newMatch((Square) t.get(POSITION_S1), (Square) t.get(POSITION_S2), (Color) t.get(POSITION_COLOR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TCSouthEastWithSameMarksMatch arrayToMatch(final Object[] match) {
    try {
    	return TCSouthEastWithSameMarksMatch.newMatch((Square) match[POSITION_S1], (Square) match[POSITION_S2], (Color) match[POSITION_COLOR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TCSouthEastWithSameMarksMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return TCSouthEastWithSameMarksMatch.newMutableMatch((Square) match[POSITION_S1], (Square) match[POSITION_S2], (Color) match[POSITION_COLOR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<TCSouthEastWithSameMarksMatcher> querySpecification() throws ViatraQueryException {
    return TCSouthEastWithSameMarksQuerySpecification.instance();
  }
}
