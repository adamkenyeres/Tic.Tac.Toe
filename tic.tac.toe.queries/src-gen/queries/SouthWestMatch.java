/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
 */
package queries;

import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.util.SouthWestQuerySpecification;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Pattern-specific match representation of the queries.SouthWest pattern,
 * to be used in conjunction with {@link SouthWestMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SouthWestMatcher
 * @see SouthWestProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SouthWestMatch extends BasePatternMatch {
  private Square fSquareN;
  
  private Square fSquareS;
  
  private Engine fEngine;
  
  private static List<String> parameterNames = makeImmutableList("squareN", "squareS", "engine");
  
  private SouthWestMatch(final Square pSquareN, final Square pSquareS, final Engine pEngine) {
    this.fSquareN = pSquareN;
    this.fSquareS = pSquareS;
    this.fEngine = pEngine;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("squareN".equals(parameterName)) return this.fSquareN;
    if ("squareS".equals(parameterName)) return this.fSquareS;
    if ("engine".equals(parameterName)) return this.fEngine;
    return null;
  }
  
  public Square getSquareN() {
    return this.fSquareN;
  }
  
  public Square getSquareS() {
    return this.fSquareS;
  }
  
  public Engine getEngine() {
    return this.fEngine;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("squareN".equals(parameterName) ) {
    	this.fSquareN = (Square) newValue;
    	return true;
    }
    if ("squareS".equals(parameterName) ) {
    	this.fSquareS = (Square) newValue;
    	return true;
    }
    if ("engine".equals(parameterName) ) {
    	this.fEngine = (Engine) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSquareN(final Square pSquareN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareN = pSquareN;
  }
  
  public void setSquareS(final Square pSquareS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareS = pSquareS;
  }
  
  public void setEngine(final Engine pEngine) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEngine = pEngine;
  }
  
  @Override
  public String patternName() {
    return "queries.SouthWest";
  }
  
  @Override
  public List<String> parameterNames() {
    return SouthWestMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquareN, fSquareS, fEngine};
  }
  
  @Override
  public SouthWestMatch toImmutable() {
    return isMutable() ? newMatch(fSquareN, fSquareS, fEngine) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"squareN\"=" + prettyPrintValue(fSquareN) + ", ");
    
    result.append("\"squareS\"=" + prettyPrintValue(fSquareS) + ", ");
    
    result.append("\"engine\"=" + prettyPrintValue(fEngine)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquareN == null) ? 0 : fSquareN.hashCode());
    result = prime * result + ((fSquareS == null) ? 0 : fSquareS.hashCode());
    result = prime * result + ((fEngine == null) ? 0 : fEngine.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SouthWestMatch)) { // this should be infrequent
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
    SouthWestMatch other = (SouthWestMatch) obj;
    if (fSquareN == null) {if (other.fSquareN != null) return false;}
    else if (!fSquareN.equals(other.fSquareN)) return false;
    if (fSquareS == null) {if (other.fSquareS != null) return false;}
    else if (!fSquareS.equals(other.fSquareS)) return false;
    if (fEngine == null) {if (other.fEngine != null) return false;}
    else if (!fEngine.equals(other.fEngine)) return false;
    return true;
  }
  
  @Override
  public SouthWestQuerySpecification specification() {
    try {
    	return SouthWestQuerySpecification.instance();
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
  public static SouthWestMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SouthWestMatch newMutableMatch(final Square pSquareN, final Square pSquareS, final Engine pEngine) {
    return new Mutable(pSquareN, pSquareS, pEngine);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareN the fixed value of pattern parameter squareN, or null if not bound.
   * @param pSquareS the fixed value of pattern parameter squareS, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SouthWestMatch newMatch(final Square pSquareN, final Square pSquareS, final Engine pEngine) {
    return new Immutable(pSquareN, pSquareS, pEngine);
  }
  
  private static final class Mutable extends SouthWestMatch {
    Mutable(final Square pSquareN, final Square pSquareS, final Engine pEngine) {
      super(pSquareN, pSquareS, pEngine);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SouthWestMatch {
    Immutable(final Square pSquareN, final Square pSquareS, final Engine pEngine) {
      super(pSquareN, pSquareS, pEngine);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
