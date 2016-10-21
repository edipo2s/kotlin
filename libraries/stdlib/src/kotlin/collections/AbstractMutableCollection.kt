@file:JvmVersion
package kotlin.collections

import java.util.AbstractCollection

/**
 * Provides a skeletal implementation of the [MutableCollection] interface.
 *
 * @param E the type of elements contained in the collection. The collection is invariant on its element type.
 */
@SinceKotlin("1.1")
public abstract class AbstractMutableCollection<E> protected constructor() : MutableCollection<E>, AbstractCollection<E>() {
    abstract override fun add(element: E): Boolean
}