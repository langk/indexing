/** Code generated by EriLex */
package databook.edsl.googql;
public class DactionHeadEqAxiom {
	public <E,S,T> F<DactionHead<S,E>,DactionHead<T,E>> appl(
		final F<S,T> eq) {
		return ((F<DactionHead<S,E>,DactionHead<T,E>>) eq) ;
	}
	public <t,S,T> F<DactionHead<t,T>,DactionHead<t,T>> appr(
		final F<S,T> eq) {
		return ((F<DactionHead<t,T>,DactionHead<t,T>>) eq) ;
	}
}
