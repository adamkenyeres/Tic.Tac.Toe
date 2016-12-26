/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/TwoMovesFromWinning.vql
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
import queries.OTwoMovesFromWinningMatch;
import queries.util.OTwoMovesFromWinningQuerySpecification;
import tictactoe.Color;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Generated pattern matcher API of the queries.oTwoMovesFromWinning pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link OTwoMovesFromWinningMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern
 * oTwoMovesFromWinning(square : Square, engine : Engine, color : Color) {
 * 	find OTwoMovesFromWinningHorizontal(square, engine, color);
 * } or {
 * //	find OTwoMovesFromWinningDiagonalRight(square, engine, color);
 * //} or {
 * //	find OTwoMovesFromWinningDiagonalLeft(square, engine, color);
 * //}or{
 * 	find OTwoMovesFromWinningVertical(square, engine, color);
 * }
 * </pre></code>
 * 
 * @see OTwoMovesFromWinningMatch
 * @see OTwoMovesFromWinningProcessor
 * @see OTwoMovesFromWinningQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class OTwoMovesFromWinningMatcher extends BaseMatcher<OTwoMovesFromWinningMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static OTwoMovesFromWinningMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    OTwoMovesFromWinningMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (OTwoMovesFromWinningMatcher)engine.getMatcher(querySpecification());
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
  public static OTwoMovesFromWinningMatcher create() throws ViatraQueryException {
    return new OTwoMovesFromWinningMatcher();
  }
  
  private final static int POSITION_SQUARE = 0;
  
  private final static int POSITION_ENGINE = 1;
  
  private final static int POSITION_COLOR = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(OTwoMovesFromWinningMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private OTwoMovesFromWinningMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return matches represented as a OTwoMovesFromWinningMatch object.
   * 
   */
  public Collection<OTwoMovesFromWinningMatch> getAllMatches(final Square pSquare, final Engine pEngine, final Color pColor) {
    return rawGetAllMatches(new Object[]{pSquare, pEngine, pColor});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return a match represented as a OTwoMovesFromWinningMatch object, or null if no match is found.
   * 
   */
  public OTwoMovesFromWinningMatch getOneArbitraryMatch(final Square pSquare, final Engine pEngine, final Color pColor) {
    return rawGetOneArbitraryMatch(new Object[]{pSquare, pEngine, pColor});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pSquare, final Engine pEngine, final Color pColor) {
    return rawHasMatch(new Object[]{pSquare, pEngine, pColor});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pSquare, final Engine pEngine, final Color pColor) {
    return rawCountMatches(new Object[]{pSquare, pEngine, pColor});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pSquare, final Engine pEngine, final Color pColor, final IMatchProcessor<? super OTwoMovesFromWinningMatch> processor) {
    rawForEachMatch(new Object[]{pSquare, pEngine, pColor}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pSquare, final Engine pEngine, final Color pColor, final IMatchProcessor<? super OTwoMovesFromWinningMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSquare, pEngine, pColor}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public OTwoMovesFromWinningMatch newMatch(final Square pSquare, final Engine pEngine, final Color pColor) {
    return OTwoMovesFromWinningMatch.newMatch(pSquare, pEngine, pColor);
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Square> rawAccumulateAllValuesOfsquare(final Object[] parameters) {
    Set<Square> results = new HashSet<Square>();
    rawAccumulateAllValues(POSITION_SQUARE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare() {
    return rawAccumulateAllValuesOfsquare(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final OTwoMovesFromWinningMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Engine pEngine, final Color pColor) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    null, 
    pEngine, 
    pColor
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Engine> rawAccumulateAllValuesOfengine(final Object[] parameters) {
    Set<Engine> results = new HashSet<Engine>();
    rawAccumulateAllValues(POSITION_ENGINE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfengine() {
    return rawAccumulateAllValuesOfengine(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfengine(final OTwoMovesFromWinningMatch partialMatch) {
    return rawAccumulateAllValuesOfengine(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for engine.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfengine(final Square pSquare, final Color pColor) {
    return rawAccumulateAllValuesOfengine(new Object[]{
    pSquare, 
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
  public Set<Color> getAllValuesOfcolor(final OTwoMovesFromWinningMatch partialMatch) {
    return rawAccumulateAllValuesOfcolor(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for color.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Color> getAllValuesOfcolor(final Square pSquare, final Engine pEngine) {
    return rawAccumulateAllValuesOfcolor(new Object[]{
    pSquare, 
    pEngine, 
    null
    });
  }
  
  @Override
  protected OTwoMovesFromWinningMatch tupleToMatch(final Tuple t) {
    try {
    	return OTwoMovesFromWinningMatch.newMatch((Square) t.get(POSITION_SQUARE), (Engine) t.get(POSITION_ENGINE), (Color) t.get(POSITION_COLOR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected OTwoMovesFromWinningMatch arrayToMatch(final Object[] match) {
    try {
    	return OTwoMovesFromWinningMatch.newMatch((Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENGINE], (Color) match[POSITION_COLOR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected OTwoMovesFromWinningMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return OTwoMovesFromWinningMatch.newMutableMatch((Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENGINE], (Color) match[POSITION_COLOR]);
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
  public static IQuerySpecification<OTwoMovesFromWinningMatcher> querySpecification() throws ViatraQueryException {
    return OTwoMovesFromWinningQuerySpecification.instance();
  }
}