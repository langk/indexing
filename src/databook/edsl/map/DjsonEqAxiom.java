/** Code generated by EriLex */
package databook.edsl.map;
public class DjsonEqAxiom {
	public <E,S,T> F<Djson<S,E>,Djson<T,E>> appl(
		final F<S,T> eq) {
		return ((F<Djson<S,E>,Djson<T,E>>) eq) ;
	}
	public <t,S,T> F<Djson<t,T>,Djson<t,T>> appr(
		final F<S,T> eq) {
		return ((F<Djson<t,T>,Djson<t,T>>) eq) ;
	}
}
