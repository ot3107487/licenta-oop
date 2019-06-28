package utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sortari<T> {
    public Sortari() {
    }

    public void mergeSort(List<T> list, Comparator<T> condition) {
        mergeSortRec(0, list.size() - 1, list, condition);
    }

    private void mergeSortRec(int left, int right, List<T> list, Comparator<T> condition) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSortRec(left, middle, list, condition);
            mergeSortRec(middle + 1, right, list, condition);
            List<T> tmp = new ArrayList<>();
            this.interclasare(left, middle, list, middle + 1, right, list, tmp, condition);
            for (int i = left; i <= right; i++) {
                list.remove(i);
                list.add(i, tmp.get(i));
            }
        }
    }

    private void interclasare(int startLeft, int endLeft, List<T> left, int startRight, int endRight, List<T> right, List<T> result, Comparator<T> conditon) {
        int i = startLeft;
        int sizeLeft = endLeft;
        int sizeRigth = endRight;
        int j = startRight;
        while (i <= sizeLeft && j <= sizeRigth) {
            T leftElem = left.get(i);
            T rightElem = right.get(j);
            if (conditon.compare(left.get(i), right.get(j)) < 0) {
                result.add(leftElem);
                i++;
            } else {
                result.add(rightElem);
                j++;
            }
        }
        while (i <= sizeLeft) {
            result.add(left.get(i));
            i++;
        }

        while (j <= sizeRigth) {
            result.add(right.get(j));
            j++;
        }
    }
}
