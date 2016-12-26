/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
 */
package queries;

import java.util.Arrays;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import queries.util.SquareQuerySpecification;
import tictactoe.Engine;
import tictactoe.Mark;
import tictactoe.Square;

/**
 * Pattern-specific match representation of the queries.square pattern,
 * to be used in conjunction with {@link SquareMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see SquareMatcher
 * @see SquareProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class SquareMatch extends BasePatternMatch {
  private Mark fSource;
  
  private Square fTarget;
  
  private Engine fEngine;
  
  private static List<String> parameterNames = makeImmutableList("source", "target", "engine");
  
  private SquareMatch(final Mark pSource, final Square pTarget, final Engine pEngine) {
    this.fSource = pSource;
    this.fTarget = pTarget;
    this.fEngine = pEngine;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("source".equals(parameterName)) return this.fSource;
    if ("target".equals(parameterName)) return this.fTarget;
    if ("engine".equals(parameterName)) return this.fEngine;
    return null;
  }
  
  public Mark getSource() {
    return this.fSource;
  }
  
  public Square getTarget() {
    return this.fTarget;
  }
  
  public Engine getEngine() {
    return this.fEngine;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("source".equals(parameterName) ) {
    	this.fSource = (Mark) newValue;
    	return true;
    }
    if ("target".equals(parameterName) ) {
    	this.fTarget = (Square) newValue;
    	return true;
    }
    if ("engine".equals(parameterName) ) {
    	this.fEngine = (Engine) newValue;
    	return true;
    }
    return false;
  }
  
  public void setSource(final Mark pSource) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSource = pSource;
  }
  
  public void setTarget(final Square pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
  }
  
  public void setEngine(final Engine pEngine) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEngine = pEngine;
  }
  
  @Override
  public String patternName() {
    return "queries.square";
  }
  
  @Override
  public List<String> parameterNames() {
    return SquareMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fSource, fTarget, fEngine};
  }
  
  @Override
  public SquareMatch toImmutable() {
    return isMutable() ? newMatch(fSource, fTarget, fEngine) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"source\"=" + prettyPrintValue(fSource) + ", ");
    
    result.append("\"target\"=" + prettyPrintValue(fTarget) + ", ");
    
    result.append("\"engine\"=" + prettyPrintValue(fEngine)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fSource == null) ? 0 : fSource.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    result = prime * result + ((fEngine == null) ? 0 : fEngine.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof SquareMatch)) { // this should be infrequent
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
    SquareMatch other = (SquareMatch) obj;
    if (fSource == null) {if (other.fSource != null) return false;}
    else if (!fSource.equals(other.fSource)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    if (fEngine == null) {if (other.fEngine != null) return false;}
    else if (!fEngine.equals(other.fEngine)) return false;
    return true;
  }
  
  @Override
  public SquareQuerySpecification specification() {
    try {
    	return SquareQuerySpecification.instance();
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
  public static SquareMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static SquareMatch newMutableMatch(final Mark pSource, final Square pTarget, final Engine pEngine) {
    return new Mutable(pSource, pTarget, pEngine);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSource the fixed value of pattern parameter source, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param pEngine the fixed value of pattern parameter engine, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static SquareMatch newMatch(final Mark pSource, final Square pTarget, final Engine pEngine) {
    return new Immutable(pSource, pTarget, pEngine);
  }
  
  private static final class Mutable extends SquareMatch {
    Mutable(final Mark pSource, final Square pTarget, final Engine pEngine) {
      super(pSource, pTarget, pEngine);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends SquareMatch {
    Immutable(final Mark pSource, final Square pTarget, final Engine pEngine) {
      super(pSource, pTarget, pEngine);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
