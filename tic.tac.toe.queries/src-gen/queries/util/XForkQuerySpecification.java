/**
 * Generated from platform:/resource/tic.tac.toe.queries/src/queries/ForkX.vql
 */
package queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.viatra.query.runtime.matchers.tuple.FlatTuple;
import queries.XForkMatch;
import queries.XForkMatcher;
import queries.util.MarkOnSquareQuerySpecification;
import queries.util.TCEastQuerySpecification;
import queries.util.TCEastWithSameMarksQuerySpecification;
import queries.util.TCNorhtWestQuerySpecification;
import queries.util.TCNorthEastQuerySpecification;
import queries.util.TCNorthEastWithSameMarksQuerySpecification;
import queries.util.TCNorthQuerySpecification;
import queries.util.TCNorthWestWithSameMarksQuerySpecification;
import queries.util.TCNorthWithSameMarksQuerySpecification;
import queries.util.TCSouthEastQuerySpecification;
import queries.util.TCSouthEastWithSameMarksQuerySpecification;
import queries.util.TCSouthQuerySpecification;
import queries.util.TCSouthWestQuerySpecification;
import queries.util.TCSouthWestWithSameMarksQuerySpecification;
import queries.util.TCSouthWithSameMarksQuerySpecification;
import queries.util.TCWestQuerySpecification;
import queries.util.TCWestWithSameMarksQuerySpecification;

/**
 * A pattern-specific query specification that can instantiate XForkMatcher in a type-safe way.
 * 
 * @see XForkMatcher
 * @see XForkMatch
 * 
 */
@SuppressWarnings("all")
public final class XForkQuerySpecification extends BaseGeneratedEMFQuerySpecification<XForkMatcher> {
  private XForkQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static XForkQuerySpecification instance() throws ViatraQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected XForkMatcher instantiate(final ViatraQueryEngine engine) throws ViatraQueryException {
    return XForkMatcher.on(engine);
  }
  
  @Override
  public XForkMatcher instantiate() throws ViatraQueryException {
    return XForkMatcher.create();
  }
  
  @Override
  public XForkMatch newEmptyMatch() {
    return XForkMatch.newEmptyMatch();
  }
  
  @Override
  public XForkMatch newMatch(final Object... parameters) {
    return XForkMatch.newMatch((tictactoe.Square) parameters[0], (tictactoe.Engine) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link XForkQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link XForkQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static XForkQuerySpecification INSTANCE = new XForkQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static XForkQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSquare = new PParameter("square", "tictactoe.Square", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Square")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEngine = new PParameter("engine", "tictactoe.Engine", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://example.com/tictactoe", "Engine")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSquare, parameter_pEngine);
    
    @Override
    public String getFullyQualifiedName() {
      return "queries.XFork";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("square","engine");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      setEvaluationHints(new QueryEvaluationHint(null, Collections.<String,Object>emptyMap()));
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_engine = body.getOrCreateVariableByName("engine");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_cntXNorth = body.getOrCreateVariableByName("cntXNorth");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		PVariable var_colorX = body.getOrCreateVariableByName("colorX");
      		PVariable var_cntXSouth = body.getOrCreateVariableByName("cntXSouth");
      		PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
      		PVariable var_cntXEast = body.getOrCreateVariableByName("cntXEast");
      		PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
      		PVariable var_cntXWest = body.getOrCreateVariableByName("cntXWest");
      		PVariable var___4_ = body.getOrCreateVariableByName("_<4>");
      		PVariable var_black = body.getOrCreateVariableByName("black");
      		PVariable var_markX = body.getOrCreateVariableByName("markX");
      		PVariable var_cntONorth = body.getOrCreateVariableByName("cntONorth");
      		PVariable var___5_ = body.getOrCreateVariableByName("_<5>");
      		PVariable var_colorO = body.getOrCreateVariableByName("colorO");
      		PVariable var_cntOSouth = body.getOrCreateVariableByName("cntOSouth");
      		PVariable var___6_ = body.getOrCreateVariableByName("_<6>");
      		PVariable var_cntOEast = body.getOrCreateVariableByName("cntOEast");
      		PVariable var___7_ = body.getOrCreateVariableByName("_<7>");
      		PVariable var_cntOWest = body.getOrCreateVariableByName("cntOWest");
      		PVariable var___8_ = body.getOrCreateVariableByName("_<8>");
      		PVariable var_white = body.getOrCreateVariableByName("white");
      		PVariable var_markO = body.getOrCreateVariableByName("markO");
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_square, parameter_pSquare),
      		   new ExportedParameter(body, var_engine, parameter_pEngine)
      		));
      		// 	Engine.square(engine, square)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		// 	neg find markOnSquare(_, square, engine)
      		new NegativePatternCall(body, new FlatTuple(var___0_, var_square, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	cntXNorth == count find TCNorthWithSameMarks(square, _, colorX)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___1_, var_colorX), TCNorthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_1_);
      		new Equality(body, var_cntXNorth, var__virtual_1_);
      		// 	cntXSouth == count find TCSouthWithSameMarks(square, _, colorX)
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___2_, var_colorX), TCSouthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_2_);
      		new Equality(body, var_cntXSouth, var__virtual_2_);
      		// 	cntXEast == count find TCEastWithSameMarks(square, _, colorX)
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___3_, var_colorX), TCEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_3_);
      		new Equality(body, var_cntXEast, var__virtual_3_);
      		// 	cntXWest == count find TCWestWithSameMarks(square, _, colorX)
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___4_, var_colorX), TCWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_4_);
      		new Equality(body, var_cntXWest, var__virtual_4_);
      		// //	cntNorthSquares == count find TCNorth(square, _);//	cntSouthSquares == count find TCSouth(square, _);//	cntEastSquares == count find TCEast(square, _);//	cntWestSquares == count find TCWest(square, _);//	check(cntNorthSquares + cntSouthSquares == 2);//	check(cntEastSquares + cntWestSquares == 2);	Engine.blackPlayer(engine, black)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "blackPlayer")));
      		new Equality(body, var__virtual_5_, var_black);
      		// 	Player.marks(black, markX)
      		new TypeConstraint(body, new FlatTuple(var_black), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new TypeConstraint(body, new FlatTuple(var_black, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_6_, var_markX);
      		// 	Mark.color(markX, colorX)
      		new TypeConstraint(body, new FlatTuple(var_markX), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new TypeConstraint(body, new FlatTuple(var_markX, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_7_, var_colorX);
      		// 	cntONorth == count find TCNorthWithSameMarks(square, _, colorO)
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___5_, var_colorO), TCNorthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_8_);
      		new Equality(body, var_cntONorth, var__virtual_8_);
      		// 	cntOSouth == count find TCSouthWithSameMarks(square, _, colorO)
      		PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___6_, var_colorO), TCSouthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_9_);
      		new Equality(body, var_cntOSouth, var__virtual_9_);
      		// 	cntOEast == count find TCEastWithSameMarks(square, _, colorO)
      		PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___7_, var_colorO), TCEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_10_);
      		new Equality(body, var_cntOEast, var__virtual_10_);
      		// 	cntOWest == count find TCWestWithSameMarks(square, _, colorO)
      		PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___8_, var_colorO), TCWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_11_);
      		new Equality(body, var_cntOWest, var__virtual_11_);
      		// 	Engine.whitePlayer(engine, white)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "whitePlayer")));
      		new Equality(body, var__virtual_12_, var_white);
      		// 	Player.marks(white, markO)
      		new TypeConstraint(body, new FlatTuple(var_white), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
      		new TypeConstraint(body, new FlatTuple(var_white, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_13_, var_markO);
      		// 	Mark.color(markO, colorO)
      		new TypeConstraint(body, new FlatTuple(var_markO), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
      		new TypeConstraint(body, new FlatTuple(var_markO, var__virtual_14_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_14_, var_colorO);
      		// 	check(cntXNorth + cntXSouth > 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntXNorth", "cntXSouth");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntXNorth = (Integer) provider.getValue("cntXNorth");
      		        Integer cntXSouth = (Integer) provider.getValue("cntXSouth");
      		        return evaluateExpression_1_1(cntXNorth, cntXSouth);
      		    }
      		},  null); 
      		// 	check(cntONorth + cntOSouth < 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntONorth", "cntOSouth");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntONorth = (Integer) provider.getValue("cntONorth");
      		        Integer cntOSouth = (Integer) provider.getValue("cntOSouth");
      		        return evaluateExpression_1_2(cntONorth, cntOSouth);
      		    }
      		},  null); 
      		// 	check(cntXEast + cntXWest > 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntXEast", "cntXWest");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntXEast = (Integer) provider.getValue("cntXEast");
      		        Integer cntXWest = (Integer) provider.getValue("cntXWest");
      		        return evaluateExpression_1_3(cntXEast, cntXWest);
      		    }
      		},  null); 
      		// 	check(cntOEast + cntOWest < 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntOEast", "cntOWest");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntOEast = (Integer) provider.getValue("cntOEast");
      		        Integer cntOWest = (Integer) provider.getValue("cntOWest");
      		        return evaluateExpression_1_4(cntOEast, cntOWest);
      		    }
      		},  null); 
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_engine = body.getOrCreateVariableByName("engine");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_cntXNorth = body.getOrCreateVariableByName("cntXNorth");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		PVariable var_colorX = body.getOrCreateVariableByName("colorX");
      		PVariable var_cntXSouth = body.getOrCreateVariableByName("cntXSouth");
      		PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
      		PVariable var_cntXNW = body.getOrCreateVariableByName("cntXNW");
      		PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
      		PVariable var_cntXSE = body.getOrCreateVariableByName("cntXSE");
      		PVariable var___4_ = body.getOrCreateVariableByName("_<4>");
      		PVariable var_cntNorthSquares = body.getOrCreateVariableByName("cntNorthSquares");
      		PVariable var___5_ = body.getOrCreateVariableByName("_<5>");
      		PVariable var_cntSouthSquares = body.getOrCreateVariableByName("cntSouthSquares");
      		PVariable var___6_ = body.getOrCreateVariableByName("_<6>");
      		PVariable var_cntNWSquares = body.getOrCreateVariableByName("cntNWSquares");
      		PVariable var___7_ = body.getOrCreateVariableByName("_<7>");
      		PVariable var_cntSESquares = body.getOrCreateVariableByName("cntSESquares");
      		PVariable var___8_ = body.getOrCreateVariableByName("_<8>");
      		PVariable var_black = body.getOrCreateVariableByName("black");
      		PVariable var_markX = body.getOrCreateVariableByName("markX");
      		PVariable var_cntONorth = body.getOrCreateVariableByName("cntONorth");
      		PVariable var___9_ = body.getOrCreateVariableByName("_<9>");
      		PVariable var_colorO = body.getOrCreateVariableByName("colorO");
      		PVariable var_cntOSouth = body.getOrCreateVariableByName("cntOSouth");
      		PVariable var___10_ = body.getOrCreateVariableByName("_<10>");
      		PVariable var_cntONW = body.getOrCreateVariableByName("cntONW");
      		PVariable var___11_ = body.getOrCreateVariableByName("_<11>");
      		PVariable var_cntOSE = body.getOrCreateVariableByName("cntOSE");
      		PVariable var___12_ = body.getOrCreateVariableByName("_<12>");
      		PVariable var_white = body.getOrCreateVariableByName("white");
      		PVariable var_markO = body.getOrCreateVariableByName("markO");
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_square, parameter_pSquare),
      		   new ExportedParameter(body, var_engine, parameter_pEngine)
      		));
      		// 	Engine.square(engine, square)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		// 	neg find markOnSquare(_, square, engine)
      		new NegativePatternCall(body, new FlatTuple(var___0_, var_square, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	cntXNorth == count find TCNorthWithSameMarks(square, _, colorX)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___1_, var_colorX), TCNorthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_1_);
      		new Equality(body, var_cntXNorth, var__virtual_1_);
      		// 	cntXSouth == count find TCSouthWithSameMarks(square, _, colorX)
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___2_, var_colorX), TCSouthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_2_);
      		new Equality(body, var_cntXSouth, var__virtual_2_);
      		// 	cntXNW == count find TCNorthWestWithSameMarks(square, _, colorX)
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___3_, var_colorX), TCNorthWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_3_);
      		new Equality(body, var_cntXNW, var__virtual_3_);
      		// 	cntXSE == count find TCSouthEastWithSameMarks(square, _, colorX)
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___4_, var_colorX), TCSouthEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_4_);
      		new Equality(body, var_cntXSE, var__virtual_4_);
      		// 	cntNorthSquares == count find TCNorth(square, _)
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___5_), TCNorthQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_5_);
      		new Equality(body, var_cntNorthSquares, var__virtual_5_);
      		// 	cntSouthSquares == count find TCSouth(square, _)
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___6_), TCSouthQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_6_);
      		new Equality(body, var_cntSouthSquares, var__virtual_6_);
      		// 	cntNWSquares == count find TCNorhtWest(square, _)
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___7_), TCNorhtWestQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_7_);
      		new Equality(body, var_cntNWSquares, var__virtual_7_);
      		// 	cntSESquares == count find TCSouthEast(square, _)
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___8_), TCSouthEastQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_8_);
      		new Equality(body, var_cntSESquares, var__virtual_8_);
      		// 	check(cntNorthSquares + cntSouthSquares == 2)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntNorthSquares", "cntSouthSquares");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntNorthSquares = (Integer) provider.getValue("cntNorthSquares");
      		        Integer cntSouthSquares = (Integer) provider.getValue("cntSouthSquares");
      		        return evaluateExpression_2_1(cntNorthSquares, cntSouthSquares);
      		    }
      		},  null); 
      		// 	check(cntNWSquares + cntSESquares == 2)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntNWSquares", "cntSESquares");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntNWSquares = (Integer) provider.getValue("cntNWSquares");
      		        Integer cntSESquares = (Integer) provider.getValue("cntSESquares");
      		        return evaluateExpression_2_2(cntNWSquares, cntSESquares);
      		    }
      		},  null); 
      		// 	Engine.blackPlayer(engine, black)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "blackPlayer")));
      		new Equality(body, var__virtual_9_, var_black);
      		// 	Player.marks(black, markX)
      		new TypeConstraint(body, new FlatTuple(var_black), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
      		new TypeConstraint(body, new FlatTuple(var_black, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_10_, var_markX);
      		// 	Mark.color(markX, colorX)
      		new TypeConstraint(body, new FlatTuple(var_markX), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
      		new TypeConstraint(body, new FlatTuple(var_markX, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_11_, var_colorX);
      		// 	cntONorth == count find TCNorthWithSameMarks(square, _, colorO)
      		PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___9_, var_colorO), TCNorthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_12_);
      		new Equality(body, var_cntONorth, var__virtual_12_);
      		// 	cntOSouth == count find TCSouthWithSameMarks(square, _, colorO)
      		PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___10_, var_colorO), TCSouthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_13_);
      		new Equality(body, var_cntOSouth, var__virtual_13_);
      		// 	cntONW == count find TCNorthWestWithSameMarks(square, _, colorO)
      		PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___11_, var_colorO), TCNorthWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_14_);
      		new Equality(body, var_cntONW, var__virtual_14_);
      		// 	cntOSE == count find TCSouthEastWithSameMarks(square, _, colorO)
      		PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___12_, var_colorO), TCSouthEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_15_);
      		new Equality(body, var_cntOSE, var__virtual_15_);
      		// 	Engine.whitePlayer(engine, white)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "whitePlayer")));
      		new Equality(body, var__virtual_16_, var_white);
      		// 	Player.marks(white, markO)
      		new TypeConstraint(body, new FlatTuple(var_white), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
      		new TypeConstraint(body, new FlatTuple(var_white, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_17_, var_markO);
      		// 	Mark.color(markO, colorO)
      		new TypeConstraint(body, new FlatTuple(var_markO), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
      		new TypeConstraint(body, new FlatTuple(var_markO, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_18_, var_colorO);
      		// 	check(cntXNorth + cntXSouth >= 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntXNorth", "cntXSouth");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntXNorth = (Integer) provider.getValue("cntXNorth");
      		        Integer cntXSouth = (Integer) provider.getValue("cntXSouth");
      		        return evaluateExpression_2_3(cntXNorth, cntXSouth);
      		    }
      		},  null); 
      		// 	check(cntXNW + cntXSE >= 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntXNW", "cntXSE");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntXNW = (Integer) provider.getValue("cntXNW");
      		        Integer cntXSE = (Integer) provider.getValue("cntXSE");
      		        return evaluateExpression_2_4(cntXNW, cntXSE);
      		    }
      		},  null); 
      		// 	check(cntONW + cntOSE == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntONW", "cntOSE");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntONW = (Integer) provider.getValue("cntONW");
      		        Integer cntOSE = (Integer) provider.getValue("cntOSE");
      		        return evaluateExpression_2_5(cntONW, cntOSE);
      		    }
      		},  null); 
      		// 	check(cntONorth + cntOSouth == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntONorth", "cntOSouth");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntONorth = (Integer) provider.getValue("cntONorth");
      		        Integer cntOSouth = (Integer) provider.getValue("cntOSouth");
      		        return evaluateExpression_2_6(cntONorth, cntOSouth);
      		    }
      		},  null); 
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_engine = body.getOrCreateVariableByName("engine");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_cntXNorth = body.getOrCreateVariableByName("cntXNorth");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		PVariable var_colorX = body.getOrCreateVariableByName("colorX");
      		PVariable var_cntXSouth = body.getOrCreateVariableByName("cntXSouth");
      		PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
      		PVariable var_cntXNE = body.getOrCreateVariableByName("cntXNE");
      		PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
      		PVariable var_cntXSW = body.getOrCreateVariableByName("cntXSW");
      		PVariable var___4_ = body.getOrCreateVariableByName("_<4>");
      		PVariable var_cntNorthSquares = body.getOrCreateVariableByName("cntNorthSquares");
      		PVariable var___5_ = body.getOrCreateVariableByName("_<5>");
      		PVariable var_cntSouthSquares = body.getOrCreateVariableByName("cntSouthSquares");
      		PVariable var___6_ = body.getOrCreateVariableByName("_<6>");
      		PVariable var_cntNEquares = body.getOrCreateVariableByName("cntNEquares");
      		PVariable var___7_ = body.getOrCreateVariableByName("_<7>");
      		PVariable var_cntSWSquares = body.getOrCreateVariableByName("cntSWSquares");
      		PVariable var___8_ = body.getOrCreateVariableByName("_<8>");
      		PVariable var_black = body.getOrCreateVariableByName("black");
      		PVariable var_markX = body.getOrCreateVariableByName("markX");
      		PVariable var_cntONorth = body.getOrCreateVariableByName("cntONorth");
      		PVariable var___9_ = body.getOrCreateVariableByName("_<9>");
      		PVariable var_colorO = body.getOrCreateVariableByName("colorO");
      		PVariable var_cntOSouth = body.getOrCreateVariableByName("cntOSouth");
      		PVariable var___10_ = body.getOrCreateVariableByName("_<10>");
      		PVariable var_cntONE = body.getOrCreateVariableByName("cntONE");
      		PVariable var___11_ = body.getOrCreateVariableByName("_<11>");
      		PVariable var_cntOSW = body.getOrCreateVariableByName("cntOSW");
      		PVariable var___12_ = body.getOrCreateVariableByName("_<12>");
      		PVariable var_white = body.getOrCreateVariableByName("white");
      		PVariable var_markO = body.getOrCreateVariableByName("markO");
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_square, parameter_pSquare),
      		   new ExportedParameter(body, var_engine, parameter_pEngine)
      		));
      		// 	Engine.square(engine, square)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		// 	neg find markOnSquare(_, square, engine)
      		new NegativePatternCall(body, new FlatTuple(var___0_, var_square, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	cntXNorth == count find TCNorthWithSameMarks(square, _, colorX)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___1_, var_colorX), TCNorthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_1_);
      		new Equality(body, var_cntXNorth, var__virtual_1_);
      		// 	cntXSouth == count find TCSouthWithSameMarks(square, _, colorX)
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___2_, var_colorX), TCSouthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_2_);
      		new Equality(body, var_cntXSouth, var__virtual_2_);
      		// 	cntXNE == count find TCNorthEastWithSameMarks(square, _, colorX)
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___3_, var_colorX), TCNorthEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_3_);
      		new Equality(body, var_cntXNE, var__virtual_3_);
      		// 	cntXSW == count find TCSouthWestWithSameMarks(square, _, colorX)
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___4_, var_colorX), TCSouthWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_4_);
      		new Equality(body, var_cntXSW, var__virtual_4_);
      		// 	cntNorthSquares == count find TCNorth(square, _)
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___5_), TCNorthQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_5_);
      		new Equality(body, var_cntNorthSquares, var__virtual_5_);
      		// 	cntSouthSquares == count find TCSouth(square, _)
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___6_), TCSouthQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_6_);
      		new Equality(body, var_cntSouthSquares, var__virtual_6_);
      		// 	cntNEquares == count find TCNorthEast(square, _)
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___7_), TCNorthEastQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_7_);
      		new Equality(body, var_cntNEquares, var__virtual_7_);
      		// 	cntSWSquares == count find TCSouthWest(square, _)
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___8_), TCSouthWestQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_8_);
      		new Equality(body, var_cntSWSquares, var__virtual_8_);
      		// 	check(cntNorthSquares + cntSouthSquares == 2)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntNorthSquares", "cntSouthSquares");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntNorthSquares = (Integer) provider.getValue("cntNorthSquares");
      		        Integer cntSouthSquares = (Integer) provider.getValue("cntSouthSquares");
      		        return evaluateExpression_3_1(cntNorthSquares, cntSouthSquares);
      		    }
      		},  null); 
      		// 	check(cntNEquares + cntSWSquares == 2)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntNEquares", "cntSWSquares");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntNEquares = (Integer) provider.getValue("cntNEquares");
      		        Integer cntSWSquares = (Integer) provider.getValue("cntSWSquares");
      		        return evaluateExpression_3_2(cntNEquares, cntSWSquares);
      		    }
      		},  null); 
      		// 	Engine.blackPlayer(engine, black)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "blackPlayer")));
      		new Equality(body, var__virtual_9_, var_black);
      		// 	Player.marks(black, markX)
      		new TypeConstraint(body, new FlatTuple(var_black), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
      		new TypeConstraint(body, new FlatTuple(var_black, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_10_, var_markX);
      		// 	Mark.color(markX, colorX)
      		new TypeConstraint(body, new FlatTuple(var_markX), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
      		new TypeConstraint(body, new FlatTuple(var_markX, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_11_, var_colorX);
      		// 	cntONorth == count find TCNorthWithSameMarks(square, _, colorO)
      		PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___9_, var_colorO), TCNorthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_12_);
      		new Equality(body, var_cntONorth, var__virtual_12_);
      		// 	cntOSouth == count find TCSouthWithSameMarks(square, _, colorO)
      		PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___10_, var_colorO), TCSouthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_13_);
      		new Equality(body, var_cntOSouth, var__virtual_13_);
      		// 	cntONE == count find TCNorthEastWithSameMarks(square, _, colorO)
      		PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___11_, var_colorO), TCNorthEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_14_);
      		new Equality(body, var_cntONE, var__virtual_14_);
      		// 	cntOSW == count find TCSouthWestWithSameMarks(square, _, colorO)
      		PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___12_, var_colorO), TCSouthWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_15_);
      		new Equality(body, var_cntOSW, var__virtual_15_);
      		// 	Engine.whitePlayer(engine, white)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "whitePlayer")));
      		new Equality(body, var__virtual_16_, var_white);
      		// 	Player.marks(white, markO)
      		new TypeConstraint(body, new FlatTuple(var_white), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
      		new TypeConstraint(body, new FlatTuple(var_white, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_17_, var_markO);
      		// 	Mark.color(markO, colorO)
      		new TypeConstraint(body, new FlatTuple(var_markO), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
      		new TypeConstraint(body, new FlatTuple(var_markO, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_18_, var_colorO);
      		// 	check(cntXNorth + cntXSouth >= 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntXNorth", "cntXSouth");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntXNorth = (Integer) provider.getValue("cntXNorth");
      		        Integer cntXSouth = (Integer) provider.getValue("cntXSouth");
      		        return evaluateExpression_3_3(cntXNorth, cntXSouth);
      		    }
      		},  null); 
      		// 	check(cntXNE + cntXSW >= 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntXNE", "cntXSW");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntXNE = (Integer) provider.getValue("cntXNE");
      		        Integer cntXSW = (Integer) provider.getValue("cntXSW");
      		        return evaluateExpression_3_4(cntXNE, cntXSW);
      		    }
      		},  null); 
      		// 	check(cntONE + cntOSW == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntONE", "cntOSW");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntONE = (Integer) provider.getValue("cntONE");
      		        Integer cntOSW = (Integer) provider.getValue("cntOSW");
      		        return evaluateExpression_3_5(cntONE, cntOSW);
      		    }
      		},  null); 
      		// 	check(cntONorth + cntOSouth == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntONorth", "cntOSouth");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntONorth = (Integer) provider.getValue("cntONorth");
      		        Integer cntOSouth = (Integer) provider.getValue("cntOSouth");
      		        return evaluateExpression_3_6(cntONorth, cntOSouth);
      		    }
      		},  null); 
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_engine = body.getOrCreateVariableByName("engine");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_cntXWest = body.getOrCreateVariableByName("cntXWest");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		PVariable var_colorX = body.getOrCreateVariableByName("colorX");
      		PVariable var_cntXEast = body.getOrCreateVariableByName("cntXEast");
      		PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
      		PVariable var_cntXNE = body.getOrCreateVariableByName("cntXNE");
      		PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
      		PVariable var_cntXSW = body.getOrCreateVariableByName("cntXSW");
      		PVariable var___4_ = body.getOrCreateVariableByName("_<4>");
      		PVariable var_cntWestSquares = body.getOrCreateVariableByName("cntWestSquares");
      		PVariable var___5_ = body.getOrCreateVariableByName("_<5>");
      		PVariable var_cntEastSquares = body.getOrCreateVariableByName("cntEastSquares");
      		PVariable var___6_ = body.getOrCreateVariableByName("_<6>");
      		PVariable var_cntNEquares = body.getOrCreateVariableByName("cntNEquares");
      		PVariable var___7_ = body.getOrCreateVariableByName("_<7>");
      		PVariable var_cntSWSquares = body.getOrCreateVariableByName("cntSWSquares");
      		PVariable var___8_ = body.getOrCreateVariableByName("_<8>");
      		PVariable var_black = body.getOrCreateVariableByName("black");
      		PVariable var_markX = body.getOrCreateVariableByName("markX");
      		PVariable var_cntOWest = body.getOrCreateVariableByName("cntOWest");
      		PVariable var___9_ = body.getOrCreateVariableByName("_<9>");
      		PVariable var_colorO = body.getOrCreateVariableByName("colorO");
      		PVariable var_cntOEast = body.getOrCreateVariableByName("cntOEast");
      		PVariable var___10_ = body.getOrCreateVariableByName("_<10>");
      		PVariable var_cntONE = body.getOrCreateVariableByName("cntONE");
      		PVariable var___11_ = body.getOrCreateVariableByName("_<11>");
      		PVariable var_cntOSW = body.getOrCreateVariableByName("cntOSW");
      		PVariable var___12_ = body.getOrCreateVariableByName("_<12>");
      		PVariable var_white = body.getOrCreateVariableByName("white");
      		PVariable var_markO = body.getOrCreateVariableByName("markO");
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_square, parameter_pSquare),
      		   new ExportedParameter(body, var_engine, parameter_pEngine)
      		));
      		// 	Engine.square(engine, square)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		// 	neg find markOnSquare(_, square, engine)
      		new NegativePatternCall(body, new FlatTuple(var___0_, var_square, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	cntXWest == count find TCWestWithSameMarks(square, _, colorX)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___1_, var_colorX), TCWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_1_);
      		new Equality(body, var_cntXWest, var__virtual_1_);
      		// 	cntXEast == count find TCEastWithSameMarks(square, _, colorX)
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___2_, var_colorX), TCEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_2_);
      		new Equality(body, var_cntXEast, var__virtual_2_);
      		// 	cntXNE == count find TCNorthEastWithSameMarks(square, _, colorX)
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___3_, var_colorX), TCNorthEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_3_);
      		new Equality(body, var_cntXNE, var__virtual_3_);
      		// 	cntXSW == count find TCSouthWestWithSameMarks(square, _, colorX)
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___4_, var_colorX), TCSouthWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_4_);
      		new Equality(body, var_cntXSW, var__virtual_4_);
      		// 	cntWestSquares == count find TCWest(square, _)
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___5_), TCWestQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_5_);
      		new Equality(body, var_cntWestSquares, var__virtual_5_);
      		// 	cntEastSquares == count find TCEast(square, _)
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___6_), TCEastQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_6_);
      		new Equality(body, var_cntEastSquares, var__virtual_6_);
      		// 	cntNEquares == count find TCNorthEast(square, _)
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___7_), TCNorthEastQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_7_);
      		new Equality(body, var_cntNEquares, var__virtual_7_);
      		// 	cntSWSquares == count find TCSouthWest(square, _)
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___8_), TCSouthWestQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_8_);
      		new Equality(body, var_cntSWSquares, var__virtual_8_);
      		// 	check(cntWestSquares + cntEastSquares == 2)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntEastSquares", "cntWestSquares");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntEastSquares = (Integer) provider.getValue("cntEastSquares");
      		        Integer cntWestSquares = (Integer) provider.getValue("cntWestSquares");
      		        return evaluateExpression_4_1(cntEastSquares, cntWestSquares);
      		    }
      		},  null); 
      		// 	check(cntNEquares + cntSWSquares == 2)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntNEquares", "cntSWSquares");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntNEquares = (Integer) provider.getValue("cntNEquares");
      		        Integer cntSWSquares = (Integer) provider.getValue("cntSWSquares");
      		        return evaluateExpression_4_2(cntNEquares, cntSWSquares);
      		    }
      		},  null); 
      		// 	Engine.blackPlayer(engine, black)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "blackPlayer")));
      		new Equality(body, var__virtual_9_, var_black);
      		// 	Player.marks(black, markX)
      		new TypeConstraint(body, new FlatTuple(var_black), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
      		new TypeConstraint(body, new FlatTuple(var_black, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_10_, var_markX);
      		// 	Mark.color(markX, colorX)
      		new TypeConstraint(body, new FlatTuple(var_markX), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
      		new TypeConstraint(body, new FlatTuple(var_markX, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_11_, var_colorX);
      		// 	cntOWest == count find TCNorthWithSameMarks(square, _, colorO)
      		PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___9_, var_colorO), TCNorthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_12_);
      		new Equality(body, var_cntOWest, var__virtual_12_);
      		// 	cntOEast == count find TCSouthWithSameMarks(square, _, colorO)
      		PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___10_, var_colorO), TCSouthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_13_);
      		new Equality(body, var_cntOEast, var__virtual_13_);
      		// 	cntONE == count find TCNorthEastWithSameMarks(square, _, colorO)
      		PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___11_, var_colorO), TCNorthEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_14_);
      		new Equality(body, var_cntONE, var__virtual_14_);
      		// 	cntOSW == count find TCSouthWestWithSameMarks(square, _, colorO)
      		PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___12_, var_colorO), TCSouthWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_15_);
      		new Equality(body, var_cntOSW, var__virtual_15_);
      		// 	Engine.whitePlayer(engine, white)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "whitePlayer")));
      		new Equality(body, var__virtual_16_, var_white);
      		// 	Player.marks(white, markO)
      		new TypeConstraint(body, new FlatTuple(var_white), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
      		new TypeConstraint(body, new FlatTuple(var_white, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_17_, var_markO);
      		// 	Mark.color(markO, colorO)
      		new TypeConstraint(body, new FlatTuple(var_markO), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
      		new TypeConstraint(body, new FlatTuple(var_markO, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_18_, var_colorO);
      		// 	check(cntXWest + cntXEast >= 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntXEast", "cntXWest");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntXEast = (Integer) provider.getValue("cntXEast");
      		        Integer cntXWest = (Integer) provider.getValue("cntXWest");
      		        return evaluateExpression_4_3(cntXEast, cntXWest);
      		    }
      		},  null); 
      		// 	check(cntXNE + cntXSW >= 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntXNE", "cntXSW");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntXNE = (Integer) provider.getValue("cntXNE");
      		        Integer cntXSW = (Integer) provider.getValue("cntXSW");
      		        return evaluateExpression_4_4(cntXNE, cntXSW);
      		    }
      		},  null); 
      		// 	check(cntONE + cntOSW == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntONE", "cntOSW");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntONE = (Integer) provider.getValue("cntONE");
      		        Integer cntOSW = (Integer) provider.getValue("cntOSW");
      		        return evaluateExpression_4_5(cntONE, cntOSW);
      		    }
      		},  null); 
      		// 	check(cntOEast + cntOWest == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntOEast", "cntOWest");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntOEast = (Integer) provider.getValue("cntOEast");
      		        Integer cntOWest = (Integer) provider.getValue("cntOWest");
      		        return evaluateExpression_4_6(cntOEast, cntOWest);
      		    }
      		},  null); 
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_square = body.getOrCreateVariableByName("square");
      		PVariable var_engine = body.getOrCreateVariableByName("engine");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var_cntXWest = body.getOrCreateVariableByName("cntXWest");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		PVariable var_colorX = body.getOrCreateVariableByName("colorX");
      		PVariable var_cntXEast = body.getOrCreateVariableByName("cntXEast");
      		PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
      		PVariable var_cntXNW = body.getOrCreateVariableByName("cntXNW");
      		PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
      		PVariable var_cntXSE = body.getOrCreateVariableByName("cntXSE");
      		PVariable var___4_ = body.getOrCreateVariableByName("_<4>");
      		PVariable var_cntWestSquares = body.getOrCreateVariableByName("cntWestSquares");
      		PVariable var___5_ = body.getOrCreateVariableByName("_<5>");
      		PVariable var_cntEastSquares = body.getOrCreateVariableByName("cntEastSquares");
      		PVariable var___6_ = body.getOrCreateVariableByName("_<6>");
      		PVariable var_cntNWSquares = body.getOrCreateVariableByName("cntNWSquares");
      		PVariable var___7_ = body.getOrCreateVariableByName("_<7>");
      		PVariable var_cntSESquares = body.getOrCreateVariableByName("cntSESquares");
      		PVariable var___8_ = body.getOrCreateVariableByName("_<8>");
      		PVariable var_black = body.getOrCreateVariableByName("black");
      		PVariable var_markX = body.getOrCreateVariableByName("markX");
      		PVariable var_cntOWest = body.getOrCreateVariableByName("cntOWest");
      		PVariable var___9_ = body.getOrCreateVariableByName("_<9>");
      		PVariable var_colorO = body.getOrCreateVariableByName("colorO");
      		PVariable var_cntOEast = body.getOrCreateVariableByName("cntOEast");
      		PVariable var___10_ = body.getOrCreateVariableByName("_<10>");
      		PVariable var_cntONW = body.getOrCreateVariableByName("cntONW");
      		PVariable var___11_ = body.getOrCreateVariableByName("_<11>");
      		PVariable var_cntOSE = body.getOrCreateVariableByName("cntOSE");
      		PVariable var___12_ = body.getOrCreateVariableByName("_<12>");
      		PVariable var_white = body.getOrCreateVariableByName("white");
      		PVariable var_markO = body.getOrCreateVariableByName("markO");
      		new TypeConstraint(body, new FlatTuple(var_square), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Square")));
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_square, parameter_pSquare),
      		   new ExportedParameter(body, var_engine, parameter_pEngine)
      		));
      		// 	Engine.square(engine, square)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "square")));
      		new Equality(body, var__virtual_0_, var_square);
      		// 	neg find markOnSquare(_, square, engine)
      		new NegativePatternCall(body, new FlatTuple(var___0_, var_square, var_engine), MarkOnSquareQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	cntXWest == count find TCWestWithSameMarks(square, _, colorX)
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___1_, var_colorX), TCWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_1_);
      		new Equality(body, var_cntXWest, var__virtual_1_);
      		// 	cntXEast == count find TCEastWithSameMarks(square, _, colorX)
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___2_, var_colorX), TCEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_2_);
      		new Equality(body, var_cntXEast, var__virtual_2_);
      		// 	cntXNW == count find TCNorthWestWithSameMarks(square, _, colorX)
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___3_, var_colorX), TCNorthWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_3_);
      		new Equality(body, var_cntXNW, var__virtual_3_);
      		// 	cntXSE == count find TCSouthEastWithSameMarks(square, _, colorX)
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___4_, var_colorX), TCSouthEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_4_);
      		new Equality(body, var_cntXSE, var__virtual_4_);
      		// 	cntWestSquares == count find TCWest(square, _)
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___5_), TCWestQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_5_);
      		new Equality(body, var_cntWestSquares, var__virtual_5_);
      		// 	cntEastSquares == count find TCEast(square, _)
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___6_), TCEastQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_6_);
      		new Equality(body, var_cntEastSquares, var__virtual_6_);
      		// 	cntNWSquares == count find TCNorhtWest(square, _)
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___7_), TCNorhtWestQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_7_);
      		new Equality(body, var_cntNWSquares, var__virtual_7_);
      		// 	cntSESquares == count find TCSouthEast(square, _)
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___8_), TCSouthEastQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_8_);
      		new Equality(body, var_cntSESquares, var__virtual_8_);
      		// 	check(cntWestSquares + cntEastSquares == 2)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntEastSquares", "cntWestSquares");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntEastSquares = (Integer) provider.getValue("cntEastSquares");
      		        Integer cntWestSquares = (Integer) provider.getValue("cntWestSquares");
      		        return evaluateExpression_5_1(cntEastSquares, cntWestSquares);
      		    }
      		},  null); 
      		// 	check(cntNWSquares + cntSESquares == 2)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntNWSquares", "cntSESquares");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntNWSquares = (Integer) provider.getValue("cntNWSquares");
      		        Integer cntSESquares = (Integer) provider.getValue("cntSESquares");
      		        return evaluateExpression_5_2(cntNWSquares, cntSESquares);
      		    }
      		},  null); 
      		// 	Engine.blackPlayer(engine, black)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "blackPlayer")));
      		new Equality(body, var__virtual_9_, var_black);
      		// 	Player.marks(black, markX)
      		new TypeConstraint(body, new FlatTuple(var_black), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
      		new TypeConstraint(body, new FlatTuple(var_black, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_10_, var_markX);
      		// 	Mark.color(markX, colorX)
      		new TypeConstraint(body, new FlatTuple(var_markX), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
      		new TypeConstraint(body, new FlatTuple(var_markX, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_11_, var_colorX);
      		// 	cntOWest == count find TCNorthWithSameMarks(square, _, colorO)
      		PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___9_, var_colorO), TCNorthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_12_);
      		new Equality(body, var_cntOWest, var__virtual_12_);
      		// 	cntOEast == count find TCSouthWithSameMarks(square, _, colorO)
      		PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___10_, var_colorO), TCSouthWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_13_);
      		new Equality(body, var_cntOEast, var__virtual_13_);
      		// 	cntONW == count find TCNorthWestWithSameMarks(square, _, colorO)
      		PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___11_, var_colorO), TCNorthWestWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_14_);
      		new Equality(body, var_cntONW, var__virtual_14_);
      		// 	cntOSE == count find TCSouthEastWithSameMarks(square, _, colorO)
      		PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
      		new PatternMatchCounter(body, new FlatTuple(var_square, var___12_, var_colorO), TCSouthEastWithSameMarksQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_15_);
      		new Equality(body, var_cntOSE, var__virtual_15_);
      		// 	Engine.whitePlayer(engine, white)
      		new TypeConstraint(body, new FlatTuple(var_engine), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Engine")));
      		PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
      		new TypeConstraint(body, new FlatTuple(var_engine, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Engine", "whitePlayer")));
      		new Equality(body, var__virtual_16_, var_white);
      		// 	Player.marks(white, markO)
      		new TypeConstraint(body, new FlatTuple(var_white), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Player")));
      		PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
      		new TypeConstraint(body, new FlatTuple(var_white, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Player", "marks")));
      		new Equality(body, var__virtual_17_, var_markO);
      		// 	Mark.color(markO, colorO)
      		new TypeConstraint(body, new FlatTuple(var_markO), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://example.com/tictactoe", "Mark")));
      		PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
      		new TypeConstraint(body, new FlatTuple(var_markO, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://example.com/tictactoe", "Mark", "color")));
      		new Equality(body, var__virtual_18_, var_colorO);
      		// 	check(cntXWest + cntXEast >= 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntXEast", "cntXWest");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntXEast = (Integer) provider.getValue("cntXEast");
      		        Integer cntXWest = (Integer) provider.getValue("cntXWest");
      		        return evaluateExpression_5_3(cntXEast, cntXWest);
      		    }
      		},  null); 
      		// 	check(cntXNW + cntXSE >= 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntXNW", "cntXSE");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntXNW = (Integer) provider.getValue("cntXNW");
      		        Integer cntXSE = (Integer) provider.getValue("cntXSE");
      		        return evaluateExpression_5_4(cntXNW, cntXSE);
      		    }
      		},  null); 
      		// 	check(cntONW + cntOSE == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntONW", "cntOSE");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntONW = (Integer) provider.getValue("cntONW");
      		        Integer cntOSE = (Integer) provider.getValue("cntOSE");
      		        return evaluateExpression_5_5(cntONW, cntOSE);
      		    }
      		},  null); 
      		// 	check(cntOEast + cntOWest == 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		
      		    @Override
      		    public String getShortDescription() {
      		        return "Expression evaluation from pattern XFork";
      		    }
      		    
      		    @Override
      		    public Iterable<String> getInputParameterNames() {
      		        return Arrays.asList("cntOEast", "cntOWest");}
      		
      		    @Override
      		    public Object evaluateExpression(IValueProvider provider) throws Exception {
      		        Integer cntOEast = (Integer) provider.getValue("cntOEast");
      		        Integer cntOWest = (Integer) provider.getValue("cntOWest");
      		        return evaluateExpression_5_6(cntOEast, cntOWest);
      		    }
      		},  null); 
      		bodies.add(body);
      	}
      	// to silence compiler error
      	if (false) throw new ViatraQueryException("Never", "happens");
      } catch (ViatraQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer cntXNorth, final Integer cntXSouth) {
    return (((cntXNorth).intValue() + (cntXSouth).intValue()) > 0);
  }
  
  private static boolean evaluateExpression_1_2(final Integer cntONorth, final Integer cntOSouth) {
    return (((cntONorth).intValue() + (cntOSouth).intValue()) < 1);
  }
  
  private static boolean evaluateExpression_1_3(final Integer cntXEast, final Integer cntXWest) {
    return (((cntXEast).intValue() + (cntXWest).intValue()) > 0);
  }
  
  private static boolean evaluateExpression_1_4(final Integer cntOEast, final Integer cntOWest) {
    return (((cntOEast).intValue() + (cntOWest).intValue()) < 1);
  }
  
  private static boolean evaluateExpression_2_1(final Integer cntNorthSquares, final Integer cntSouthSquares) {
    return (((cntNorthSquares).intValue() + (cntSouthSquares).intValue()) == 2);
  }
  
  private static boolean evaluateExpression_2_2(final Integer cntNWSquares, final Integer cntSESquares) {
    return (((cntNWSquares).intValue() + (cntSESquares).intValue()) == 2);
  }
  
  private static boolean evaluateExpression_2_3(final Integer cntXNorth, final Integer cntXSouth) {
    return (((cntXNorth).intValue() + (cntXSouth).intValue()) >= 1);
  }
  
  private static boolean evaluateExpression_2_4(final Integer cntXNW, final Integer cntXSE) {
    return (((cntXNW).intValue() + (cntXSE).intValue()) >= 1);
  }
  
  private static boolean evaluateExpression_2_5(final Integer cntONW, final Integer cntOSE) {
    return (((cntONW).intValue() + (cntOSE).intValue()) == 0);
  }
  
  private static boolean evaluateExpression_2_6(final Integer cntONorth, final Integer cntOSouth) {
    return (((cntONorth).intValue() + (cntOSouth).intValue()) == 0);
  }
  
  private static boolean evaluateExpression_3_1(final Integer cntNorthSquares, final Integer cntSouthSquares) {
    return (((cntNorthSquares).intValue() + (cntSouthSquares).intValue()) == 2);
  }
  
  private static boolean evaluateExpression_3_2(final Integer cntNEquares, final Integer cntSWSquares) {
    return (((cntNEquares).intValue() + (cntSWSquares).intValue()) == 2);
  }
  
  private static boolean evaluateExpression_3_3(final Integer cntXNorth, final Integer cntXSouth) {
    return (((cntXNorth).intValue() + (cntXSouth).intValue()) >= 1);
  }
  
  private static boolean evaluateExpression_3_4(final Integer cntXNE, final Integer cntXSW) {
    return (((cntXNE).intValue() + (cntXSW).intValue()) >= 1);
  }
  
  private static boolean evaluateExpression_3_5(final Integer cntONE, final Integer cntOSW) {
    return (((cntONE).intValue() + (cntOSW).intValue()) == 0);
  }
  
  private static boolean evaluateExpression_3_6(final Integer cntONorth, final Integer cntOSouth) {
    return (((cntONorth).intValue() + (cntOSouth).intValue()) == 0);
  }
  
  private static boolean evaluateExpression_4_1(final Integer cntEastSquares, final Integer cntWestSquares) {
    return (((cntWestSquares).intValue() + (cntEastSquares).intValue()) == 2);
  }
  
  private static boolean evaluateExpression_4_2(final Integer cntNEquares, final Integer cntSWSquares) {
    return (((cntNEquares).intValue() + (cntSWSquares).intValue()) == 2);
  }
  
  private static boolean evaluateExpression_4_3(final Integer cntXEast, final Integer cntXWest) {
    return (((cntXWest).intValue() + (cntXEast).intValue()) >= 1);
  }
  
  private static boolean evaluateExpression_4_4(final Integer cntXNE, final Integer cntXSW) {
    return (((cntXNE).intValue() + (cntXSW).intValue()) >= 1);
  }
  
  private static boolean evaluateExpression_4_5(final Integer cntONE, final Integer cntOSW) {
    return (((cntONE).intValue() + (cntOSW).intValue()) == 0);
  }
  
  private static boolean evaluateExpression_4_6(final Integer cntOEast, final Integer cntOWest) {
    return (((cntOEast).intValue() + (cntOWest).intValue()) == 0);
  }
  
  private static boolean evaluateExpression_5_1(final Integer cntEastSquares, final Integer cntWestSquares) {
    return (((cntWestSquares).intValue() + (cntEastSquares).intValue()) == 2);
  }
  
  private static boolean evaluateExpression_5_2(final Integer cntNWSquares, final Integer cntSESquares) {
    return (((cntNWSquares).intValue() + (cntSESquares).intValue()) == 2);
  }
  
  private static boolean evaluateExpression_5_3(final Integer cntXEast, final Integer cntXWest) {
    return (((cntXWest).intValue() + (cntXEast).intValue()) >= 1);
  }
  
  private static boolean evaluateExpression_5_4(final Integer cntXNW, final Integer cntXSE) {
    return (((cntXNW).intValue() + (cntXSE).intValue()) >= 1);
  }
  
  private static boolean evaluateExpression_5_5(final Integer cntONW, final Integer cntOSE) {
    return (((cntONW).intValue() + (cntOSE).intValue()) == 0);
  }
  
  private static boolean evaluateExpression_5_6(final Integer cntOEast, final Integer cntOWest) {
    return (((cntOEast).intValue() + (cntOWest).intValue()) == 0);
  }
}
