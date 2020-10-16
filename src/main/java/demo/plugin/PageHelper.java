package demo.plugin;

import org.apache.ibatis.executor.statement.PreparedStatementHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.sql.Connection;

@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class PageHelper implements Interceptor {
  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    Object proceed = invocation.proceed();
    // ((PreparedStatementHandler) ((RoutingStatementHandler) invocation.getTarget()).delegate).boundSql;
    return proceed;

  }

  @Override
  public Object plugin(Object target) {
    return target instanceof StatementHandler
      ? Plugin.wrap(target, this)
      : target;
  }
}
