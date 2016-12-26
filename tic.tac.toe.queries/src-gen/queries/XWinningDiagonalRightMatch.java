/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/RulesWinning.vql
 */
package queries;

import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.util.XWinningDiagonalRightQuerySpecification;
import tictactoe.Color;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Pattern-specific match representation of the queries.XWinningDiagonalRight pattern,
 * to be used in conjunction with {@link XWinningDiagonalRightMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see XWinningDiagonalRightMatcher
 * @see XWinningDiagonalRightProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class XWinningDiagonalRightMatch extends BasePatternMatch {
  private Square fSquare;
  
  private Engine fEngine;
  
  private Color fColor;
  
  private static List<String> parameterNames = makeImmutableList("square", "engine", "color");
  
  private XWinningDiagonalRightMatch(final Square pSquare, final Engine pEngine, final Color pColor) {
    this.fSquare = pSquare;
    this.fEngine = pEngine;
    this.fColor = pColor;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("square".equals(parameterName)) return this.fSquare;
    if ("engine".equals(parameterName)) return this.fEngine;
    if ("color".equals(parameterName)) return this.fColor;
    return null;
  }
  
  public Square getSquare() {
    return this.fSquare;
  }
  
  public Engine getEngine() {
    return this.fEngine;
  }
  
  public Color getColor() {
    return this.fColor;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("square".equals(parameterName) ) {
    	this.fSquare = (Square) newValue;
    	return true;
    }
    if ("engine".equals(parameterName) ) {
    	this.fEngine = (Engine) newValue;
    	return true;
    }
    if ("color".equals(parameterName) ) {
    	this.fColor = (Color) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSquare(final Square pSquare) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquare = pSquare;
  }
  
  public void setEngine(final Engine pEngine) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEngine = pEngine;
  }
  
  public void setColor(final Color pColor) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fColor = pColor;
  }
  
  @Override
  public String patternName() {
    return "queries.XWinningDiagonalRight";
  }
  
  @Override
  public List<String> parameterNames() {
    return XWinningDiagonalRightMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquare, fEngine, fColor};
  }
  
  @Override
  public XWinningDiagonalRightMatch toImmutable() {
    return isMutable() ? newMatch(fSquare, fEngine, fColor) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"square\"=" + prettyPrintValue(fSquare) + ", ");
    
    result.append("\"engine\"=" + prettyPrintValue(fEngine) + ", ");
    
    result.append("\"color\"=" + prettyPrintValue(fColor)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    result = prime * result + ((fEngine == null) ? 0 : fEngine.hashCode());
    result = prime * result + ((fColor == null) ? 0 : fColor.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof XWinningDiagonalRightMatch)) { // this should be infrequent
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
    XWinningDiagonalRightMatch other = (XWinningDiagonalRightMatch) obj;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    if (fEngine == null) {if (other.fEngine != null) return false;}
    else if (!fEngine.equals(other.fEngine)) return false;
    if (fColor == null) {if (other.fColor != null) return false;}
    else if (!fColor.equals(other.fColor)) return false;
    return true;
  }
  
  @Override
  public XWinningDiagonalRightQuerySpecification specification() {
    try {
    	return XWinningDiagonalRightQuerySpecification.instance();
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
  public static XWinningDiagonalRightMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static XWinningDiagonalRightMatch newMutableMatch(final Square pSquare, final Engine pEngine, final Color pColor) {
    return new Mutable(pSquare, pEngine, pColor);
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
  public static XWinningDiagonalRightMatch newMatch(final Square pSquare, final Engine pEngine, final Color pColor) {
    return new Immutable(pSquare, pEngine, pColor);
  }
  
  private static final class Mutable extends XWinningDiagonalRightMatch {
    Mutable(final Square pSquare, final Engine pEngine, final Color pColor) {
      super(pSquare, pEngine, pColor);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends XWinningDiagonalRightMatch {
    Immutable(final Square pSquare, final Engine pEngine, final Color pColor) {
      super(pSquare, pEngine, pColor);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
