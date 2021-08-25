package test.benchmark;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

public class StringSplitBenchmark {

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @BenchmarkMode(Mode.Throughput)
    public void startSplit(Blackhole blackhole) {
        String input = "1:wUS!>ne'7Q,bSQVs9N*p$^nm>^Z&SBW `7g]V]UT>)dZZ{ U}Ed4Z]bSkjpJXM4WW2Es)A0ewDh(-?Y]#g#VA~H745;4%[z{GoLBT|bX6#(3;%;9Bb5/{n<V5gAAv{.r";
        blackhole.consume(input.split(":"));
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @BenchmarkMode(Mode.Throughput)
    public void midSplit(Blackhole blackhole) {
        String input = "1wUS!>ne'7Q,bSQVs9N*p$^nm>^Z&SBW `7g]V]UT>)dZZ{ U}Ed4Z]bSkjpJXM4WW2Es:)A0ewDh(-?Y]#g#VA~H745;4%[z{GoLBT|bX6#(3;%;9Bb5/{n<V5gAAv{.r";
        blackhole.consume(input.split(":"));
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @BenchmarkMode(Mode.Throughput)
    public void endSplit(Blackhole blackhole) {
        String input = "1wUS!>ne'7Q,bSQVs9N*p$^nm>^Z&SBW `7g]V]UT>)dZZ{ U}Ed4Z]bSkjpJXM4WW2Es)A0ewDh(-?Y]#g#VA~H745;4%[z{GoLBT|bX6#(3;%;9Bb5/{n<V5gAAv{.:r";
        blackhole.consume(input.split(":"));
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @BenchmarkMode(Mode.Throughput)
    public void noMatchSplit(Blackhole blackhole) {
        String input = "1wUS!>ne'7Q,bSQVs9N*p$^nm>^Z&SBW `7g]V]UT>)dZZ{ U}Ed4Z]bSkjpJXM4WW2Es)A0ewDh(-?Y]#g#VA~H745;4%[z{GoLBT|bX6#(3;%;9Bb5/{n<V5gAAv{.r";
        blackhole.consume(input.split(":"));
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @BenchmarkMode(Mode.Throughput)
    public void startSplitShort(Blackhole blackhole) {
        String input = "1:wUS";
        blackhole.consume(input.split(":"));
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @BenchmarkMode(Mode.Throughput)
    public void midSplitShort(Blackhole blackhole) {
        String input = "1w:US";
        blackhole.consume(input.split(":"));
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @BenchmarkMode(Mode.Throughput)
    public void endSplitShort(Blackhole blackhole) {
        String input = "1wU:S";
        blackhole.consume(input.split(":"));
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @Warmup(iterations = 2)
    @Measurement(iterations = 2)
    @BenchmarkMode(Mode.Throughput)
    public void noMatchSplitShort(Blackhole blackhole) {
        String input = "1wUS";
        blackhole.consume(input.split(":"));
    }
}