package com.veracloud.logging;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * API for sending log output to {@link java.util.logging.Logger}.
 */
public final class Log {
  private static final String SELF = Log.class.getName();

  public static Log get(Class<?> cls) {
    return LogFactory.getLog(cls);
  }
  
  public static Log get(String name) {
    return LogFactory.getLog(name);
  }

  private final Logger mLogger;

  // WARN: Log constructor should have only package access so
  // that only LogFactory be able to create one.
  Log(String name) {
    mLogger = Logger.getLogger(name);
  }

  /**
   * Get wrapped {@link Logger} instance.
   */
  public Logger getLogger() {
    return mLogger;
  }

  // ---------------------------
  // TRACE
  // ---------------------------

  /**
   * Is this logger instance enabled for the FINEST level?
   * 
   * @return True if this Logger is enabled for level FINEST, false otherwise.
   */
  public boolean isTraceEnabled() {
    return mLogger.isLoggable(Level.FINEST);
  }

  /**
   * Log a message at level FINEST according to the specified format and
   * arguments.
   * 
   * @param format
   *          the format string
   * @param args
   *          the arguments
   */
  public void t(String format, Object... args) {
    if (mLogger.isLoggable(Level.FINEST)) {
      log(Level.FINEST, format, args, null);
    }
  }

  /**
   * Log an exception (throwable) at level FINEST with an accompanying logging
   * callback.
   * 
   * @param cb
   *          the logging callback to use
   */
  public void t(Callback cb) {
    if (mLogger.isLoggable(Level.FINEST)) {
      try {
        log(Level.FINEST, cb.get(), null);
      } catch (RuntimeException ex) {
        logUncaughtExceptionInCb(ex, null);
      }
    }
  };

  /**
   * Log an exception (throwable) at level FINEST with an accompanying message
   * according to the specified format and arguments.
   * 
   * @param t
   *          the exception (throwable) to log
   * @param format
   *          the format string
   * @param args
   *          the arguments
   */
  public void t(Throwable t, String format, Object... args) {
    if (mLogger.isLoggable(Level.FINEST)) {
      log(Level.FINEST, format, args, t);
    }
  }

  /**
   * Log an exception (throwable) at level FINEST with an accompanying logging
   * callback.
   * 
   * @param t
   *          the exception (throwable) to log
   * @param cb
   *          the logging callback to use
   */
  public void t(Throwable t, Callback cb) {
    if (mLogger.isLoggable(Level.FINEST)) {
      try {
        log(Level.FINEST, cb.get(), null);
      } catch (RuntimeException ex) {
        logUncaughtExceptionInCb(ex, t);
      }
    }
  };

  // ---------------------------
  // DEBUG
  // ---------------------------

  /**
   * Is this logger instance enabled for the FINE level?
   * 
   * @return True if this Logger is enabled for level FINE, false otherwise.
   */
  public boolean isDebugEnabled() {
    return mLogger.isLoggable(Level.FINE);
  }

  /**
   * Log a message at level FINE according to the specified format and
   * arguments.
   * 
   * @param format
   *          the format string
   * @param args
   *          the arguments
   */
  public void d(String format, Object... args) {
    if (mLogger.isLoggable(Level.FINE)) {
      log(Level.FINE, format, args, null);
    }
  }

  /**
   * Log an exception (throwable) at level FINE with an accompanying logging
   * callback.
   * 
   * @param cb
   *          the logging callback to use
   */
  public void d(Callback cb) {
    if (mLogger.isLoggable(Level.FINE)) {
      try {
        log(Level.FINE, cb.get(), null);
      } catch (RuntimeException ex) {
        logUncaughtExceptionInCb(ex, null);
      }
    }
  };

  /**
   * Log an exception (throwable) at level FINE with an accompanying message
   * according to the specified format and arguments.
   * 
   * @param t
   *          the exception (throwable) to log
   * @param format
   *          the format string
   * @param args
   *          the arguments
   */
  public void d(Throwable t, String format, Object... args) {
    if (mLogger.isLoggable(Level.FINE)) {
      log(Level.FINE, format, args, t);
    }
  }

  /**
   * Log an exception (throwable) at level FINE with an accompanying logging
   * callback.
   * 
   * @param t
   *          the exception (throwable) to log
   * @param cb
   *          the logging callback to use
   */
  public void d(Throwable t, Callback cb) {
    if (mLogger.isLoggable(Level.FINE)) {
      try {
        log(Level.FINE, cb.get(), null);
      } catch (RuntimeException ex) {
        logUncaughtExceptionInCb(ex, t);
      }
    }
  };

  // ---------------------------
  // INFO
  // ---------------------------

  /**
   * Is this logger instance enabled for the INFO level?
   * 
   * @return True if this Logger is enabled for the INFO level, false otherwise.
   */
  public boolean isInfoEnabled() {
    return mLogger.isLoggable(Level.INFO);
  }

  /**
   * Log a message at level INFO according to the specified format and
   * arguments.
   * 
   * @param format
   *          the format string
   * @param args
   *          the arguments
   */
  public void i(String format, Object... args) {
    if (mLogger.isLoggable(Level.INFO)) {
      log(Level.INFO, format, args, null);
    }
  }

  /**
   * Log an exception (throwable) at level INFO with an accompanying logging
   * callback.
   * 
   * @param t
   *          the exception (throwable) to log
   * @param cb
   *          the logging callback to use
   */
  public void i(Callback cb) {
    if (mLogger.isLoggable(Level.INFO)) {
      try {
        log(Level.INFO, cb.get(), null);
      } catch (RuntimeException ex) {
        logUncaughtExceptionInCb(ex, null);
      }
    }
  };

  /**
   * Log an exception (throwable) at level INFO with an accompanying message
   * according to the specified format and arguments.
   * 
   * @param t
   *          the exception (throwable) to log
   * @param format
   *          the format string
   * @param args
   *          the arguments
   */
  public void i(Throwable t, String format, Object... args) {
    if (mLogger.isLoggable(Level.INFO)) {
      log(Level.INFO, format, args, t);
    }
  }

  /**
   * Log an exception (throwable) at level INFO with an accompanying logging
   * callback.
   * 
   * @param t
   *          the exception (throwable) to log
   * @param cb
   *          the logging callback to use
   */
  public void i(Throwable t, Callback cb) {
    if (mLogger.isLoggable(Level.INFO)) {
      try {
        log(Level.INFO, cb.get(), null);
      } catch (RuntimeException ex) {
        logUncaughtExceptionInCb(ex, t);
      }
    }
  };

  // ---------------------------
  // WARNING
  // ---------------------------

  /**
   * Is this logger instance enabled for the WARNING level?
   * 
   * @return True if this Logger is enabled for the WARNING level, false
   *         otherwise.
   */
  public boolean isWarnEnabled() {
    return mLogger.isLoggable(Level.WARNING);
  }

  /**
   * Log a message at level WARNING according to the specified format and
   * arguments.
   * 
   * @param format
   *          the format string
   * @param args
   *          the arguments
   */
  public void w(String format, Object... args) {
    if (mLogger.isLoggable(Level.WARNING)) {
      log(Level.WARNING, format, args, null);
    }
  }

  /**
   * Log an exception (throwable) at level WARNING with an accompanying logging
   * callback.
   * 
   * @param cb
   *          the logging callback to use
   */
  public void w(Callback cb) {
    if (mLogger.isLoggable(Level.WARNING)) {
      try {
        log(Level.WARNING, cb.get(), null);
      } catch (RuntimeException ex) {
        logUncaughtExceptionInCb(ex, null);
      }
    }
  };

  /**
   * Log an exception (throwable) at level WARNING with an accompanying message
   * according to the specified format and arguments.
   * 
   * @param t
   *          the exception (throwable) to log
   * @param format
   *          the format string
   * @param args
   *          the arguments
   */
  public void w(Throwable t, String format, Object... args) {
    if (mLogger.isLoggable(Level.WARNING)) {
      log(Level.WARNING, format, args, t);
    }
  }

  /**
   * Log an exception (throwable) at level WARNING with an accompanying logging
   * callback.
   * 
   * @param t
   *          the exception (throwable) to log
   * @param cb
   *          the logging callback to use
   */
  public void w(Throwable t, Callback cb) {
    if (mLogger.isLoggable(Level.WARNING)) {
      try {
        log(Level.WARNING, cb.get(), null);
      } catch (RuntimeException ex) {
        logUncaughtExceptionInCb(ex, t);
      }
    }
  };

  // ---------------------------
  // ERROR
  // ---------------------------

  /**
   * Is this logger instance enabled for level SEVERE?
   * 
   * @return True if this Logger is enabled for level SEVERE, false otherwise.
   */
  public boolean isErrorEnabled() {
    return mLogger.isLoggable(Level.SEVERE);
  }

  /**
   * Log a message at level SEVERE according to the specified format and
   * arguments.
   * 
   * @param format
   *          the format string
   * @param args
   *          the arguments
   */
  public void e(String format, Object... args) {
    if (mLogger.isLoggable(Level.SEVERE)) {
      log(Level.SEVERE, format, args, null);
    }
  }

  /**
   * Log an exception (throwable) at level SEVERE with an accompanying logging
   * callback.
   * 
   * @param cb
   *          the logging callback to use
   */
  public void e(Callback cb) {
    if (mLogger.isLoggable(Level.SEVERE)) {
      try {
        log(Level.SEVERE, cb.get(), null);
      } catch (RuntimeException ex) {
        logUncaughtExceptionInCb(ex, null);
      }
    }
  };

  /**
   * Log an exception (throwable) at level SEVERE with an accompanying message
   * according to the specified format and arguments.
   * 
   * @param t
   *          the exception (throwable) to log
   * @param format
   *          the format string
   * @param args
   *          the arguments
   */
  public void e(Throwable t, String format, Object... args) {
    if (mLogger.isLoggable(Level.SEVERE)) {
      log(Level.SEVERE, format, args, t);
    }
  }

  /**
   * Log an exception (throwable) at level SEVERE with an accompanying logging
   * callback.
   * 
   * @param t
   *          the exception (throwable) to log
   * @param cb
   *          the logging callback to use
   */
  public void e(Throwable t, Callback cb) {
    if (mLogger.isLoggable(Level.SEVERE)) {
      try {
        log(Level.SEVERE, cb.get(), null);
      } catch (RuntimeException ex) {
        logUncaughtExceptionInCb(ex, t);
      }
    }
  };

  // ---------------------------------------------------------------------
  // Implementation (thanks to SLF4J)
  // ---------------------------------------------------------------------

  private void log(Level level, String format, Object[] args, Throwable t) {
    try {
      log(level, String.format(format, args), t);
    } catch (RuntimeException ex) {
      log(Level.WARNING, String.format("Formatting error: `%s' [%s]", format, ex), t);
    }
  }

  private void logUncaughtExceptionInCb(RuntimeException ex, Throwable t) {
    log(Level.WARNING, String.format("Callback error: [%s]", ex), t);
  }

  private void log(Level level, String msg, Throwable t) {
    LogRecord record = new LogRecord(level, msg);
    record.setThrown(t);
    fillCallerData(SELF, record);
    mLogger.log(record);
  }

  private void fillCallerData(String callerFQCN, LogRecord record) {
    StackTraceElement[] steArray = new Throwable().getStackTrace();

    int selfIndex = -1;
    for (int i = 0; i < steArray.length; i++) {
      final String className = steArray[i].getClassName();
      if (className.equals(callerFQCN)) {
        selfIndex = i;
        break;
      }
    }

    int found = -1;
    for (int i = selfIndex + 1; i < steArray.length; i++) {
      final String className = steArray[i].getClassName();
      if (!(className.equals(callerFQCN))) {
        found = i;
        break;
      }
    }

    if (found != -1) {
      StackTraceElement ste = steArray[found];
      // setting the class name has the side effect of setting
      // the needToInferCaller variable to false.
      record.setSourceClassName(ste.getClassName());
      record.setSourceMethodName(ste.getMethodName());
    }
  }

  // ---------------------------

  /** Logging callback. */
  public static interface Callback /* extends Supplier<String> */ {
    String get();
  }
}
