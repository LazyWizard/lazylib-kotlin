package org.lazywizard.lazylib.ext.combat

import com.fs.starfarer.api.combat.*
import com.fs.starfarer.api.fleet.FleetMemberAPI
import org.lazywizard.lazylib.combat.AIUtils
import org.lazywizard.lazylib.combat.CombatUtils
import org.lwjgl.util.vector.Vector2f

fun CombatEntityAPI.getNearestObjective(): BattleObjectiveAPI? = AIUtils.getNearestObjective(this)
fun CombatEntityAPI.getNearbyObjectives(range: Float): List<BattleObjectiveAPI> = CombatUtils.getObjectivesWithinRange(this.location, range)

fun CombatEntityAPI.getNearestShip(): ShipAPI? = AIUtils.getNearestShip(this)
fun CombatEntityAPI.getNearbyShips(range: Float): List<ShipAPI> = CombatUtils.getShipsWithinRange(this.location, range)

fun CombatEntityAPI.getNearestMissile(): MissileAPI? = AIUtils.getNearestMissile(this)
fun CombatEntityAPI.getNearbyMissiles(range:Float): List<MissileAPI> = CombatUtils.getMissilesWithinRange(this.location, range)

fun CombatEntityAPI.getNearestAlly(): ShipAPI? = AIUtils.getNearestAlly(this)
fun CombatEntityAPI.getNearbyAllies(range: Float): List<ShipAPI> = AIUtils.getNearbyAllies(this, range)
fun CombatEntityAPI.getAlliesOnMap(): List<ShipAPI> = AIUtils.getAlliesOnMap(this)

fun CombatEntityAPI.getNearestEnemyMissile(): MissileAPI? = AIUtils.getNearestEnemyMissile(this)
fun CombatEntityAPI.getNearbyEnemyMissiles(range: Float): List<MissileAPI> = AIUtils.getNearbyEnemyMissiles(this, range)
fun CombatEntityAPI.getEnemyMissilesOnMap(): List<MissileAPI> = AIUtils.getEnemyMissilesOnMap(this)

fun CombatEntityAPI.getNearestEnemy(): ShipAPI? = AIUtils.getNearestEnemy(this)
fun CombatEntityAPI.getNearbyEnemies(range: Float): List<ShipAPI> = AIUtils.getNearbyEnemies(this, range)
fun CombatEntityAPI.getEnemiesOnMap(): List<ShipAPI> = AIUtils.getEnemiesOnMap(this)

fun ShipAPI.canUseSystemThisFrame(): Boolean = AIUtils.canUseSystemThisFrame(this)
fun ShipAPI.getFleetMember(): FleetMemberAPI? = CombatUtils.getFleetMember(this)
fun ShipAPI.isVisibleToSide(side: Int): Boolean = CombatUtils.isVisibleToSide(this, side)

fun CombatEntityAPI.applyForce(direction: Vector2f, force: Float) = CombatUtils.applyForce(this, direction, force)
fun CombatEntityAPI.applyForce(direction: Float, force: Float) = CombatUtils.applyForce(this, direction, force)