@file:JvmVersion
package kotlin.collections

import java.util.AbstractMap

/**
 * Provides a skeletal implementation of the [MutableMap] interface.
 *
 * The implementor is required to implement [entries] property, which should return mutable set of map entries, and [put] function.
 *
 * @param K the type of map keys. The map is invariant on its key type.
 * @param V the type of map values. The map is invariant on its value type.
 */
@SinceKotlin("1.1")
public abstract class AbstractMutableMap<K, V> protected constructor() : MutableMap<K, V>, AbstractMap<K, V>() {
    abstract override fun put(key: K, value: V): V?
}