/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/RulesWinning.vql
 */
package queries;

import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.util.XWinningQuerySpecification;
import tictactoe.Color;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Pattern-specific match representation of the queries.XWinning pattern,
 * to be used in conjunction with {@link XWinningMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see XWinningMatcher
 * @see XWinningProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class XWinningMatch extends BasePatternMatch {
  private Square fSquare;
  
  private Engine fEng;
  
  private Color fColor;
  
  private static List<String> parameterNames = makeImmutableList("square", "eng", "color");
  
  private XWinningMatch(final Square pSquare, final Engine pEng, final Color pColor) {
    this.fSquare = pSquare;
    this.fEng = pEng;
    this.fColor = pColor;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("square".equals(parameterName)) return this.fSquare;
    if ("eng".equals(parameterName)) return this.fEng;
    if ("color".equals(parameterName)) return this.fColor;
    return null;
  }
  
  public Square getSquare() {
    return this.fSquare;
  }
  
  public Engine getEng() {
    return this.fEng;
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
    if ("eng".equals(parameterName) ) {
    	this.fEng = (Engine) newValue;
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
  
  public void setEng(final Engine pEng) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEng = pEng;
  }
  
  public void setColor(final Color pColor) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fColor = pColor;
  }
  
  @Override
  public String patternName() {
    return "queries.XWinning";
  }
  
  @Override
  public List<String> parameterNames() {
    return XWinningMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquare, fEng, fColor};
  }
  
  @Override
  public XWinningMatch toImmutable() {
    return isMutable() ? newMatch(fSquare, fEng, fColor) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"square\"=" + prettyPrintValue(fSquare) + ", ");
    
    result.append("\"eng\"=" + prettyPrintValue(fEng) + ", ");
    
    result.append("\"color\"=" + prettyPrintValue(fColor)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    result = prime * result + ((fEng == null) ? 0 : fEng.hashCode());
    result = prime * result + ((fColor == null) ? 0 : fColor.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof XWinningMatch)) { // this should be infrequent
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
    XWinningMatch other = (XWinningMatch) obj;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    if (fEng == null) {if (other.fEng != null) return false;}
    else if (!fEng.equals(other.fEng)) return false;
    if (fColor == null) {if (other.fColor != null) return false;}
    else if (!fColor.equals(other.fColor)) return false;
    return true;
  }
  
  @Override
  public XWinningQuerySpecification specification() {
    try {
    	return XWinningQuerySpecification.instance();
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
  public static XWinningMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEng the fixed value of pattern parameter eng, or null if not bound.
   * @param pColor the fixed value of pattern parameter color, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static XWinningMatch newMutableMatch(final Square pSquare, final Engine pEng, final Color pColor) {
    return new Mutable(pSquare, pEng, pColor);
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
  public static XWinningMatch newMatch(final Square pSquare, final Engine pEng, final Color pColor) {
    return new Immutable(pSquare, pEng, pColor);
  }
  
  private static final class Mutable extends XWinningMatch {
    Mutable(final Square pSquare, final Engine pEng, final Color pColor) {
      super(pSquare, pEng, pColor);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends XWinningMatch {
    Immutable(final Square pSquare, final Engine pEng, final Color pColor) {
      super(pSquare, pEng, pColor);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
