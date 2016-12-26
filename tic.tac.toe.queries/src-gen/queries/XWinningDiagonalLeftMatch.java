/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/RulesWinning.vql
 */
package queries;

import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.util.XWinningDiagonalLeftQuerySpecification;
import tictactoe.Color;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Pattern-specific match representation of the queries.XWinningDiagonalLeft pattern,
 * to be used in conjunction with {@link XWinningDiagonalLeftMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see XWinningDiagonalLeftMatcher
 * @see XWinningDiagonalLeftProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class XWinningDiagonalLeftMatch extends BasePatternMatch {
  private Square fSquare;
  
  private Engine fEngine;
  
  private Color fColor;
  
  private static List<String> parameterNames = makeImmutableList("square", "engine", "color");
  
  private XWinningDiagonalLeftMatch(final Square pSquare, final Engine pEngine, final Color pColor) {
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
    return "queries.XWinningDiagonalLeft";
  }
  
  @Override
  public List<String> parameterNames() {
    return XWinningDiagonalLeftMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquare, fEngine, fColor};
  }
  
  @Override
  public XWinningDiagonalLeftMatch toImmutable() {
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
    if (!(obj instanceof XWinningDiagonalLeftMatch)) { // this should be infrequent
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
    XWinningDiagonalLeftMatch other = (XWinningDiagonalLeftMatch) obj;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    if (fEngine == null) {if (other.fEngine != null) return false;}
    else if (!fEngine.equals(other.fEngine)) return false;
    if (fColor == null) {if (other.fColor != null) return false;}
    else if (!fColor.equals(other.fColor)) return false;
    return true;
  }
  
  @Override
  public XWinningDiagonalLeftQuerySpecification specification() {
    try {
    	return XWinningDiagonalLeftQuerySpecification.instance();
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
  public static XWinningDiagonalLeftMatch newEmptyMatch() {
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
  public static XWinningDiagonalLeftMatch newMutableMatch(final Square pSquare, final Engine pEngine, final Color pColor) {
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
  public static XWinningDiagonalLeftMatch newMatch(final Square pSquare, final Engine pEngine, final Color pColor) {
    return new Immutable(pSquare, pEngine, pColor);
  }
  
  private static final class Mutable extends XWinningDiagonalLeftMatch {
    Mutable(final Square pSquare, final Engine pEngine, final Color pColor) {
      super(pSquare, pEngine, pColor);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends XWinningDiagonalLeftMatch {
    Immutable(final Square pSquare, final Engine pEngine, final Color pColor) {
      super(pSquare, pEngine, pColor);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
