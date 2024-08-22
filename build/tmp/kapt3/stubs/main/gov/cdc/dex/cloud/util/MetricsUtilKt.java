package gov.cdc.dex.cloud.util;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.slf4j.LoggerFactory;
import java.util.concurrent.TimeUnit;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0004\u001a\u0013\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u0010\u0007\u001a\f\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\n\u001a&\u0010\u000b\u001a\u00020\f*\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a-\u0010\u0011\u001a\u0004\u0018\u00010\u0006*\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0012\u001a\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a-\u0010\u0014\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u0015*\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0017\u00a2\u0006\u0002\u0010\u0018\u001aD\u0010\u0019\u001a\u0002H\u0015\"\u0004\b\u0000\u0010\u0015*\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u00042#\u0010\u0016\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\t\u00a2\u0006\f\b\u001b\u0012\b\b\u000e\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00150\u001a\u00a2\u0006\u0002\u0010\u001c\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "gaugeName", "", "nsToMs", "", "(Ljava/lang/Long;)J", "startTimer", "Lio/micrometer/core/instrument/Timer$Sample;", "Lio/micrometer/core/instrument/MeterRegistry;", "stopMeter", "", "timer", "name", "fromError", "", "stopTimer", "(Lio/micrometer/core/instrument/MeterRegistry;Lio/micrometer/core/instrument/Timer$Sample;Ljava/lang/String;Z)Ljava/lang/Long;", "timerName", "withMetrics", "R", "block", "Lkotlin/Function0;", "(Lio/micrometer/core/instrument/MeterRegistry;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withMetricsTimer", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "(Lio/micrometer/core/instrument/MeterRegistry;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "lib-cloud-proxy"})
public final class MetricsUtilKt {
    private static final org.slf4j.Logger logger = null;
    
    public static final <R extends java.lang.Object>R withMetrics(@org.jetbrains.annotations.Nullable
    io.micrometer.core.instrument.MeterRegistry $this$withMetrics, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<? extends R> block) {
        return null;
    }
    
    /**
     * This extension fn instruments your code block with metrics, but allows the code block additional control
     * over stopping any custom internal timers
     */
    public static final <R extends java.lang.Object>R withMetricsTimer(@org.jetbrains.annotations.Nullable
    io.micrometer.core.instrument.MeterRegistry $this$withMetricsTimer, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super io.micrometer.core.instrument.Timer.Sample, ? extends R> block) {
        return null;
    }
    
    public static final void stopMeter(@org.jetbrains.annotations.NotNull
    io.micrometer.core.instrument.MeterRegistry $this$stopMeter, @org.jetbrains.annotations.Nullable
    io.micrometer.core.instrument.Timer.Sample timer, @org.jetbrains.annotations.NotNull
    java.lang.String name, boolean fromError) {
    }
    
    @org.jetbrains.annotations.Nullable
    public static final io.micrometer.core.instrument.Timer.Sample startTimer(@org.jetbrains.annotations.NotNull
    io.micrometer.core.instrument.MeterRegistry $this$startTimer) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Long stopTimer(@org.jetbrains.annotations.NotNull
    io.micrometer.core.instrument.MeterRegistry $this$stopTimer, @org.jetbrains.annotations.Nullable
    io.micrometer.core.instrument.Timer.Sample timer, @org.jetbrains.annotations.NotNull
    java.lang.String name, boolean fromError) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String gaugeName(@org.jetbrains.annotations.NotNull
    java.lang.String $this$gaugeName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String timerName(@org.jetbrains.annotations.NotNull
    java.lang.String $this$timerName, boolean fromError) {
        return null;
    }
    
    private static final long nsToMs(java.lang.Long $this$nsToMs) {
        return 0L;
    }
}