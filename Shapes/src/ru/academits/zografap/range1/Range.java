package ru.academits.zografap.range1;

class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getIntervalLength() {

        return Math.abs(from - to);
    }

    public boolean isInside(double x) {
        return (x >= from && x <= to);
    }
}


