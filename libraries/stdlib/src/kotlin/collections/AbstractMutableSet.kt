@file:JvmVersion
package kotlin.collections

import java.util.AbstractSet

/**
 * Provides a skeletal implementation of the [MutableSet] interface.
 *
 * @param E the type of elements contained in the set. The set is invariant on its element type.
 */
@SinceKotlin("1.1")
public abstract class AbstractMutableSet<E> protected constructor() : MutableSet<E>, AbstractSet<E>() {
    abstract override fun add(element: E): Boolean
}