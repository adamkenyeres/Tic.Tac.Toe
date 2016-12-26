/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/BasicRules.vql
 */
package queries;

import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.util.OppositeXCornerQuerySpecification;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Pattern-specific match representation of the queries.oppositeXCorner pattern,
 * to be used in conjunction with {@link OppositeXCornerMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see OppositeXCornerMatcher
 * @see OppositeXCornerProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class OppositeXCornerMatch extends BasePatternMatch {
  private Square fSquare;
  
  private Engine fEngine;
  
  private static List<String> parameterNames = makeImmutableList("square", "engine");
  
  private OppositeXCornerMatch(final Square pSquare, final Engine pEngine) {
    this.fSquare = pSquare;
    this.fEngine = pEngine;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("square".equals(parameterName)) return this.fSquare;
    if ("engine".equals(parameterName)) return this.fEngine;
    return null;
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
    return "queries.oppositeXCorner";
  }
  
  @Override
  public List<String> parameterNames() {
    return OppositeXCornerMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquare, fEngine};
  }
  
  @Override
  public OppositeXCornerMatch toImmutable() {
    return isMutable() ? newMatch(fSquare, fEngine) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"square\"=" + prettyPrintValue(fSquare) + ", ");
    
    result.append("\"engine\"=" + prettyPrintValue(fEngine)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquare == null) ? 0 : fSquare.hashCode());
    result = prime * result + ((fEngine == null) ? 0 : fEngine.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof OppositeXCornerMatch)) { // this should be infrequent
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
    OppositeXCornerMatch other = (OppositeXCornerMatch) obj;
    if (fSquare == null) {if (other.fSquare != null) return false;}
    else if (!fSquare.equals(other.fSquare)) return false;
    if (fEngine == null) {if (other.fEngine != null) return false;}
    else if (!fEngine.equals(other.fEngine)) return false;
    return true;
  }
  
  @Override
  public OppositeXCornerQuerySpecification specification() {
    try {
    	return OppositeXCornerQuerySpecification.instance();
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
  public static OppositeXCornerMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static OppositeXCornerMatch newMutableMatch(final Square pSquare, final Engine pEngine) {
    return new Mutable(pSquare, pEngine);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquare the fixed value of pattern parameter square, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static OppositeXCornerMatch newMatch(final Square pSquare, final Engine pEngine) {
    return new Immutable(pSquare, pEngine);
  }
  
  private static final class Mutable extends OppositeXCornerMatch {
    Mutable(final Square pSquare, final Engine pEngine) {
      super(pSquare, pEngine);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends OppositeXCornerMatch {
    Immutable(final Square pSquare, final Engine pEngine) {
      super(pSquare, pEngine);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
