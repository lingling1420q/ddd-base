package org.ddd.base.domain;

/**
* biz层通用接口，维持入口代码稳定
*author  likongpeng
*date 2019/4/7
*/
public interface Application<T, R> {

  /**
   * biz层唯一入口
   * 负责编排,事务
   * @param request
   * @return
   */
  R doAction(T request);
}