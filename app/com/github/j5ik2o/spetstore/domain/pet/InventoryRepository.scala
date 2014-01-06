package com.github.j5ik2o.spetstore.domain.pet

import com.github.j5ik2o.spetstore.infrastructure.support.Repository

/**
 * [[com.github.j5ik2o.spetstore.domain.pet.Inventory]]のためのリポジトリ責務。
 */
trait InventoryRepository extends Repository[InventoryId, Inventory] {

  type This = InventoryRepository

}

/**
 * コンパニオンオブジェクト。
 */
object InventoryRepository {

  /**
   * メモリ用リポジトリを生成する。
   *
   * @param entities エンティティの集合
   * @return [[com.github.j5ik2o.spetstore.domain.pet.CategoryRepository]]
   */
  def ofMemory(entities: Map[InventoryId, Inventory] = Map.empty): InventoryRepository =
    new InventoryRepositoryOnMemory(entities)

  /**
   * JDBC用リポジトリを生成する。
   *
   * @return [[com.github.j5ik2o.spetstore.domain.pet.CategoryRepository]]
   */
  def ofJDBC: InventoryRepository = new InventoryRepositoryOnJDBC

}

