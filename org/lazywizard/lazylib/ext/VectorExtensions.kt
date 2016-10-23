package org.lazywizard.lazylib.ext

import org.lazywizard.lazylib.VectorUtils
import org.lwjgl.util.vector.Vector2f

fun Vector2f.getFacing(): Float = VectorUtils.getFacing(this)
fun Vector2f.getAngle(to: Vector2f): Float = VectorUtils.getAngle(this, to)
fun Vector2f.getDirectionalVector(destination: Vector2f): Vector2f = VectorUtils.getDirectionalVector(this, destination)
fun Vector2f.getCrossProduct(other: Vector2f): Float = VectorUtils.getCrossProduct(this, other)
fun Vector2f.rotate(amount: Float): Vector2f = VectorUtils.rotate(this, amount, Vector2f())
fun Vector2f.rotateAroundPivot(pivotPoint: Vector2f, amount: Float): Vector2f = VectorUtils.rotateAroundPivot(this, pivotPoint, amount, Vector2f())