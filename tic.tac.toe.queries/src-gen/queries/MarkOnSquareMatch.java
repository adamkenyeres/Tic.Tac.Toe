/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
 */
package queries;

import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.util.MarkOnSquareQuerySpecification;
import tictactoe.Engine;
import tictactoe.Mark;
import tictactoe.Square;

/**
 * Pattern-specific match representation of the queries.markOnSquare pattern,
 * to be used in conjunction with {@link MarkOnSquareMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MarkOnSquareMatcher
 * @see MarkOnSquareProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MarkOnSquareMatch extends BasePatternMatch {
  private Mark fMark;
  
  private Square fSquare;
  
  private Engine fEngine;
  
  private static List<String> parameterNames = makeImmutableList("mark", "square", "engine");
  
  private MarkOnSquareMatch(final Mark pMark, final Square pSquare, final Engine pEngine) {
    this.fMark = pMark;
    this.fSquare = pSquare;
    this.fEngine = pEngine;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("mark".equals(parameterName)) return this.fMark;
    if ("square".equals(parameterName)) return this.fSquare;
    if ("engine".equals(parameterName)) return this.fEngine;
    return null;
  }
  
  public Mark getMark() {
    return this.fMark;
  }
  
  public Square getSquare() {
    return this.fSquare;
  }
  
  public Engine getEngine() {
    return this.fEngine;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("mark".equals(parameterName) ) {
    	this.fMark = (Mark) newValue;
    	return true;
    }
    if ("square".equals(parameterName) ) {
    	this.fSquare = (Square) newValue;
    	return true;
    }
    if ("engine".equals(parameterName) ) {
    	this.fEngine = (Engine) newValue;
    	return true;
    }
    return false;
  }
  
  public void setMark(final Mark pMark) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMark = pMark;
  }
  
  public void setSquare(final Square pSquare) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquare = pSquare;
  }
  
  public void setEngine(final Engine pEngine) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEngine = pEngine;
  }
  
  @Override
  public String patternName() {
    return "queries.markOnSquare";
  }
  
  @Override
  public List<String> parameterNames() {
    return MarkOnSquareMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fMark, fSquare, fEngine};
  }
  
  @Override
  public MarkOnSquareMatch toImmutable() {
    return isMutable() ? newMatch(fMark, fSquare, fEngine) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"mark\"=" + prettyPrintValue(fMark) + ", ");
    
    result.append("\"square\"=" + prettyPrintValue(fSquare) + ", ");
    
    result.append("\"engine\"=" + prettyPrintValue(fEngine)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fMark == null) ? 0 : fMark.hashCode());
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    result = prime * result + ((fEngine == null) ? 0 : fEngine.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MarkOnSquareMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    MarkOnSquareMatch other = (MarkOnSquareMatch) obj;
    if (fMark == null) {if (other.fMark != null) return false;}
    else if (!fMark.equals(other.fMark)) return false;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    if (fEngine == null) {if (other.fEngine != null) return false;}
    else if (!fEngine.equals(other.fEngine)) return false;
    return true;
  }
  
  @Override
  public MarkOnSquareQuerySpecification specification() {
    try {
    	return MarkOnSquareQuerySpecification.instance();
    } catch (ViatraQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static MarkOnSquareMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pMark the fixed value of pattern parameter mark, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MarkOnSquareMatch newMutableMatch(final Mark pMark, final Square pSquare, final Engine pEngine) {
    return new Mutable(pMark, pSquare, pEngine);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMark the fixed value of pattern parameter mark, or null if not bound.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MarkOnSquareMatch newMatch(final Mark pMark, final Square pSquare, final Engine pEngine) {
    return new Immutable(pMark, pSquare, pEngine);
  }
  
  private static final class Mutable extends MarkOnSquareMatch {
    Mutable(final Mark pMark, final Square pSquare, final Engine pEngine) {
      super(pMark, pSquare, pEngine);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MarkOnSquareMatch {
    Immutable(final Mark pMark, final Square pSquare, final Engine pEngine) {
      super(pMark, pSquare, pEngine);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
