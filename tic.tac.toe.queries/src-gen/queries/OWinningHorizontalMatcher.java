/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/RulesWinning.vql
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
import queries.OWinningHorizontalMatch;
import queries.util.OWinningHorizontalQuerySpecification;
import tictactoe.Color;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Generated pattern matcher API of the queries.OWinningHorizontal pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link OWinningHorizontalMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern OWinningHorizontal(square : Square,engine : Engine, color : Color){
 * 	Engine.square(engine,square);
 * 	cntEast == count find TCEastWithSameMarks(square,_,color);
 * 	cntWest  == count find TCWestWithSameMarks(square,_,color);
 * 	neg find markOnSquare(_,square, engine);
 * 	check(cntEast + cntWest == 2);
 * 	Engine.whitePlayer(engine,white);
 * 	Player.marks(white,mark);
 * 	Mark.color(mark, color);
 * }
 * </pre></code>
 * 
 * @see OWinningHorizontalMatch
 * @see OWinningHorizontalProcessor
 * @see OWinningHorizontalQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class OWinningHorizontalMatcher extends BaseMatcher<OWinningHorizontalMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static OWinningHorizontalMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    OWinningHorizontalMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (OWinningHorizontalMatcher)engine.getMatcher(querySpecification());
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
  public static OWinningHorizontalMatcher create() throws ViatraQueryException {
    return new OWinningHorizontalMatcher();
  }
  
  private final static int POSITION_SQUARE = 0;
  
  private final static int POSITION_ENGINE = 1;
  
  private final static int POSITION_COLOR = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(OWinningHorizontalMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private OWinningHorizontalMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return matches represented as a OWinningHorizontalMatch object.
   * 
   */
  public Collection<OWinningHorizontalMatch> getAllMatches(final Square pSquare, final Engine pEngine, final Color pColor) {
    return rawGetAllMatches(new Object[]{pSquare, pEngine, pColor});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return a match represented as a OWinningHorizontalMatch object, or null if no match is found.
   * 
   */
  public OWinningHorizontalMatch getOneArbitraryMatch(final Square pSquare, final Engine pEngine, final Color pColor) {
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
  public void forEachMatch(final Square pSquare, final Engine pEngine, final Color pColor, final IMatchProcessor<? super OWinningHorizontalMatch> processor) {
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
  public boolean forOneArbitraryMatch(final Square pSquare, final Engine pEngine, final Color pColor, final IMatchProcessor<? super OWinningHorizontalMatch> processor) {
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
  public OWinningHorizontalMatch newMatch(final Square pSquare, final Engine pEngine, final Color pColor) {
    return OWinningHorizontalMatch.newMatch(pSquare, pEngine, pColor);
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
  public Set<Square> getAllValuesOfsquare(final OWinningHorizontalMatch partialMatch) {
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
  public Set<Engine> getAllValuesOfengine(final OWinningHorizontalMatch partialMatch) {
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
  public Set<Color> getAllValuesOfcolor(final OWinningHorizontalMatch partialMatch) {
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
  protected OWinningHorizontalMatch tupleToMatch(final Tuple t) {
    try {
    	return OWinningHorizontalMatch.newMatch((Square) t.get(POSITION_SQUARE), (Engine) t.get(POSITION_ENGINE), (Color) t.get(POSITION_COLOR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected OWinningHorizontalMatch arrayToMatch(final Object[] match) {
    try {
    	return OWinningHorizontalMatch.newMatch((Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENGINE], (Color) match[POSITION_COLOR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected OWinningHorizontalMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return OWinningHorizontalMatch.newMutableMatch((Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENGINE], (Color) match[POSITION_COLOR]);
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
  public static IQuerySpecification<OWinningHorizontalMatcher> querySpecification() throws ViatraQueryException {
    return OWinningHorizontalQuerySpecification.instance();
  }
}