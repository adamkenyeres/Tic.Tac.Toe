/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/QueryBasedFeatures.vql
 */
package queries.util;

import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import queries.EMatch;
import tictactoe.Square;

/**
 * A match processor tailored for the queries.E pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EProcessor implements IMatchProcessor<EMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSource the value of pattern parameter source in the currently processed match
   * @param pTarget the value of pattern parameter target in the currently processed match
   * 
   */
  public abstract void process(final Square pSource, final Square pTarget);
  
  @Override
  public void process(final EMatch match) {
    process(match.getSource(), match.getTarget());
  }
}
