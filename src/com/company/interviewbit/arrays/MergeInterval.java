//package com.company.interviewbit;
//
//
//import sun.jvm.hotspot.utilities.Interval;
//
//import java.util.*;
//
////Note that if max(a,c) > min(b,d),
////then the intervals do not overlap. Otherwise, they overlap.
////Once we figure out the intervals ( interval[i] to interval[j] )
////which overlap with newInterval, note that we can replace all the
////overlapping intervals with one interval which would be
////(min(interval[i].start, newInterval.start), max(interval[j].end, newInterval.end)).
//
//public class MergeInterval {
//
//    public static void main(String[] args) {
//
//        Interval[] A ={ new Interval(6037774, 6198243), new Interval(6726550, 7004541),new Interval(8842554, 10866536),new Interval(11027721, 11341296),new Interval(11972532, 14746848),new Interval(16374805, 16706396),new Interval(17557262, 20518214),new Interval(22139780, 22379559),new Interval(27212352, 28404611),new Interval(28921768, 29621583),new Interval(29823256, 32060921),new Interval(33950165, 36418956),new Interval(37225039, 37785557),new Interval(40087908, 41184444),new Interval(41922814, 45297414),new Interval(48142402, 48244133),new Interval(48622983, 50443163),new Interval(50898369, 55612831),new Interval(57030757, 58120901),new Interval(59772759, 59943999),new Interval(61141939, 64859907),new Interval(65277782, 65296274),new Interval(67497842, 68386607),new Interval(70414085, 73339545),new Interval(73896106, 75605861),new Interval(79672668, 84539434),new Interval(84821550, 86558001),new Interval(91116470, 92198054),new Interval(96147808, 98979097)};
//
////        B : (36210193, 61984219)
//
////        ArrayList<Interval> intervalArrayList = new ArrayList<>();
////        intervalArrayList.add(new Interval(1, 3));
////        intervalArrayList.add(new Interval(6, 9));
//
//        try {
//            Interval interval = new Interval(36210193, 61984219);
//
//            merge(, interval);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static ArrayList<Interval> insert(Interval[] intervals, Interval newInterval) {
//        LinkedList<Long> linkedList = new LinkedList<>();
//
//
//        for (Interval interval : intervals) {
//            int start = interval.start;
//            int end = interval.end;
//            while (start < end) {
//                linkedList.add((long) start++);
//            }
//        }
//
//        int start = newInterval.start;
//        int end = newInterval.end;
//        while (start < end) {
//            linkedList.add((long) start++);
//        }
//
//        Object[] a =linkedList.toArray();
//        Arrays.sort(a);
//        ListIterator<Long> i = linkedList.listIterator();
//        for (Object e : a) {
//            i.next();
//            i.set((Long) e);
//        }
//
//        ArrayList<Interval> intervalArrayList = new ArrayList<>();
//
//        Iterator<Long> iterator = linkedList.iterator();
//        Long startInterval = iterator.next();
//        Long previous = startInterval;
//
//        while (iterator.hasNext()) {
//            Long next = iterator.next();
//            if (next - previous > 1 || !iterator.hasNext()) {
//                intervalArrayList.add(new Interval(startInterval, next));
//                if (iterator.hasNext()) {
//                    startInterval = iterator.next();
//                    previous = startInterval;
//                }
//            } else {
//                previous = next;
//            }
//        }
//        return intervalArrayList;
//    }
//
//    private class IntervalComparator implements Comparator<Interval> {
//        @Override
//        public int compare(Interval a, Interval b) {
//            return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
//        }
//    }
//
//    public static List<Interval> merge(List<Interval> intervals) {
//        Collections.sort(intervals, new IntervalComparator());
//
//        LinkedList<Interval> merged = new LinkedList<Interval>();
//        for (Interval interval : intervals) {
//            // if the list of merged intervals is empty or if the current
//            // interval does not overlap with the previous, simply append it.
//            if (merged.isEmpty() || merged.getLast().end < interval.start) {
//                merged.add(interval);
//            }
//            // otherwise, there is overlap, so we merge the current and previous
//            // intervals.
//            else {
//                merged.getLast().end = Math.max(merged.getLast().end, interval.end);
//            }
//        }
//
//        return merged;
//    }
//}
//
//    public static class Interval {
//        int start;
//        int end;
//
//        Interval(Long startInterval, Long next) {
//            start = 0;
//            end = 0;
//        }
//
//        Interval(int s, int e) {
//            start = s;
//            end = e;
//        }
//
//        @Override
//        public String toString() {
//            return "Interval{" +
//                    "start=" + start +
//                    ", end=" + end +
//                    '}';
//        }
//    }
//}
