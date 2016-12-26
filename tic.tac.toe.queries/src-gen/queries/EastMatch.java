/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
 */
package queries;

import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.util.EastQuerySpecification;
import tictactoe.Engine;
import tictactoe.Square;

/**
 * Pattern-specific match representation of the queries.East pattern,
 * to be used in conjunction with {@link EastMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EastMatcher
 * @see EastProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EastMatch extends BasePatternMatch {
  private Square fSquareW;
  
  private Square fSquareE;
  
  private Engine fEngine;
  
  private static List<String> parameterNames = makeImmutableList("squareW", "squareE", "engine");
  
  private EastMatch(final Square pSquareW, final Square pSquareE, final Engine pEngine) {
    this.fSquareW = pSquareW;
    this.fSquareE = pSquareE;
    this.fEngine = pEngine;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("squareW".equals(parameterName)) return this.fSquareW;
    if ("squareE".equals(parameterName)) return this.fSquareE;
    if ("engine".equals(parameterName)) return this.fEngine;
    return null;
  }
  
  public Square getSquareW() {
    return this.fSquareW;
  }
  
  public Square getSquareE() {
    return this.fSquareE;
  }
  
  public Engine getEngine() {
    return this.fEngine;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("squareW".equals(parameterName) ) {
    	this.fSquareW = (Square) newValue;
    	return true;
    }
    if ("squareE".equals(parameterName) ) {
    	this.fSquareE = (Square) newValue;
    	return true;
    }
    if ("engine".equals(parameterName) ) {
    	this.fEngine = (Engine) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSquareW(final Square pSquareW) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareW = pSquareW;
  }
  
  public void setSquareE(final Square pSquareE) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSquareE = pSquareE;
  }
  
  public void setEngine(final Engine pEngine) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEngine = pEngine;
  }
  
  @Override
  public String patternName() {
    return "queries.East";
  }
  
  @Override
  public List<String> parameterNames() {
    return EastMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSquareW, fSquareE, fEngine};
  }
  
  @Override
  public EastMatch toImmutable() {
    return isMutable() ? newMatch(fSquareW, fSquareE, fEngine) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"squareW\"=" + prettyPrintValue(fSquareW) + ", ");
    
    result.append("\"squareE\"=" + prettyPrintValue(fSquareE) + ", ");
    
    result.append("\"engine\"=" + prettyPrintValue(fEngine)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSquareW == null) ? 0 : fSquareW.hashCode());
    result = prime * result + ((fSquareE == null) ? 0 : fSquareE.hashCode());
    result = prime * result + ((fEngine == null) ? 0 : fEngine.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof EastMatch)) { // this should be infrequent
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
    EastMatch other = (EastMatch) obj;
    if (fSquareW == null) {if (other.fSquareW != null) return false;}
    else if (!fSquareW.equals(other.fSquareW)) return false;
    if (fSquareE == null) {if (other.fSquareE != null) return false;}
    else if (!fSquareE.equals(other.fSquareE)) return false;
    if (fEngine == null) {if (other.fEngine != null) return false;}
    else if (!fEngine.equals(other.fEngine)) return false;
    return true;
  }
  
  @Override
  public EastQuerySpecification specification() {
    try {
    	return EastQuerySpecification.instance();
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
  public static EastMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSquareW the fixed value of pattern parameter squareW, or null if not bound.
   * @param pSquareE the fixed value of pattern parameter squareE, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static EastMatch newMutableMatch(final Square pSquareW, final Square pSquareE, final Engine pEngine) {
    return new Mutable(pSquareW, pSquareE, pEngine);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSquareW the fixed value of pattern parameter squareW, or null if not bound.
   * @param pSquareE the fixed value of pattern parameter squareE, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static EastMatch newMatch(final Square pSquareW, final Square pSquareE, final Engine pEngine) {
    return new Immutable(pSquareW, pSquareE, pEngine);
  }
  
  private static final class Mutable extends EastMatch {
    Mutable(final Square pSquareW, final Square pSquareE, final Engine pEngine) {
      super(pSquareW, pSquareE, pEngine);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends EastMatch {
    Immutable(final Square pSquareW, final Square pSquareE, final Engine pEngine) {
      super(pSquareW, pSquareE, pEngine);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
