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
import queries.XWinningMatch;
import queries.util.XWinningQuerySpecification;
import tictactoe.Color;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Generated pattern matcher API of the queries.XWinning pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link XWinningMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern XWinning(square : Square,eng : Engine, color : Color){
 * 	find  XWinningDiagonalLeft(square,eng,color);
 * }or{
 * 	find XWinningDiagonalRight(square,eng,color);
 * }or{
 * 	find XWinningHorizontal(square,eng,color);
 * }or{
 * 	find XWinningVertical(square,eng,color);
 * }
 * </pre></code>
 * 
 * @see XWinningMatch
 * @see XWinningProcessor
 * @see XWinningQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class XWinningMatcher extends BaseMatcher<XWinningMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static XWinningMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    XWinningMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = (XWinningMatcher)engine.getMatcher(querySpecification());
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
  public static XWinningMatcher create() throws ViatraQueryException {
    return new XWinningMatcher();
  }
  
  private final static int POSITION_SQUARE = 0;
  
  private final static int POSITION_ENG = 1;
  
  private final static int POSITION_COLOR = 2;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(XWinningMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private XWinningMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEng the fixed value of pattern parameter eng, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return matches represented as a XWinningMatch object.
   * 
   */
  public Collection<XWinningMatch> getAllMatches(final Square pSquare, final Engine pEng, final Color pColor) {
    return rawGetAllMatches(new Object[]{pSquare, pEng, pColor});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEng the fixed value of pattern parameter eng, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return a match represented as a XWinningMatch object, or null if no match is found.
   * 
   */
  public XWinningMatch getOneArbitraryMatch(final Square pSquare, final Engine pEng, final Color pColor) {
    return rawGetOneArbitraryMatch(new Object[]{pSquare, pEng, pColor});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEng the fixed value of pattern parameter eng, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Square pSquare, final Engine pEng, final Color pColor) {
    return rawHasMatch(new Object[]{pSquare, pEng, pColor});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEng the fixed value of pattern parameter eng, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Square pSquare, final Engine pEng, final Color pColor) {
    return rawCountMatches(new Object[]{pSquare, pEng, pColor});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEng the fixed value of pattern parameter eng, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Square pSquare, final Engine pEng, final Color pColor, final IMatchProcessor<? super XWinningMatch> processor) {
    rawForEachMatch(new Object[]{pSquare, pEng, pColor}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEng the fixed value of pattern parameter eng, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Square pSquare, final Engine pEng, final Color pColor, final IMatchProcessor<? super XWinningMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSquare, pEng, pColor}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEng the fixed value of pattern parameter eng, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public XWinningMatch newMatch(final Square pSquare, final Engine pEng, final Color pColor) {
    return XWinningMatch.newMatch(pSquare, pEng, pColor);
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
  public Set<Square> getAllValuesOfsquare(final XWinningMatch partialMatch) {
    return rawAccumulateAllValuesOfsquare(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for square.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Square> getAllValuesOfsquare(final Engine pEng, final Color pColor) {
    return rawAccumulateAllValuesOfsquare(new Object[]{
    null, 
    pEng, 
    pColor
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for eng.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Engine> rawAccumulateAllValuesOfeng(final Object[] parameters) {
    Set<Engine> results = new HashSet<Engine>();
    rawAccumulateAllValues(POSITION_ENG, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for eng.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfeng() {
    return rawAccumulateAllValuesOfeng(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for eng.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfeng(final XWinningMatch partialMatch) {
    return rawAccumulateAllValuesOfeng(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for eng.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Engine> getAllValuesOfeng(final Square pSquare, final Color pColor) {
    return rawAccumulateAllValuesOfeng(new Object[]{
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
  public Set<Color> getAllValuesOfcolor(final XWinningMatch partialMatch) {
    return rawAccumulateAllValuesOfcolor(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for color.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Color> getAllValuesOfcolor(final Square pSquare, final Engine pEng) {
    return rawAccumulateAllValuesOfcolor(new Object[]{
    pSquare, 
    pEng, 
    null
    });
  }
  
  @Override
  protected XWinningMatch tupleToMatch(final Tuple t) {
    try {
    	return XWinningMatch.newMatch((Square) t.get(POSITION_SQUARE), (Engine) t.get(POSITION_ENG), (Color) t.get(POSITION_COLOR));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected XWinningMatch arrayToMatch(final Object[] match) {
    try {
    	return XWinningMatch.newMatch((Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENG], (Color) match[POSITION_COLOR]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected XWinningMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return XWinningMatch.newMutableMatch((Square) match[POSITION_SQUARE], (Engine) match[POSITION_ENG], (Color) match[POSITION_COLOR]);
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
  public static IQuerySpecification<XWinningMatcher> querySpecification() throws ViatraQueryException {
    return XWinningQuerySpecification.instance();
  }
}
