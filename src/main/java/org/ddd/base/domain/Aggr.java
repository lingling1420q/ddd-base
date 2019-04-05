package org.ddd.base.domain;

/**
 * Aggr 聚合，命名：名词+Aggr
 * author  likongpeng
 * date 2019/4/5
 */
public interface Aggr<T> extends DomainI {

  /**
   * 得到聚合根
   */
  T getAggrRoot();

}