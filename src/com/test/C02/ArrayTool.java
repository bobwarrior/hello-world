package com.test.C02;

/** �ҵ����������
 *����һ�����ڲ�������Ĺ����ࡣ
 *���磺��ȡ��ֵ�������۰롣
 *@author ����
 *@version V1.0
*/
 public class ArrayTool
{
 
    /**     ����Ŀղ������캯����
    */
    private ArrayTool(){}

    /**
    ��ȡint��������ֵ��
    @param arr ���ڽ���һ��int���͵����顣
    @return ���ظ������е����ֵ��
    */
    public static int getMax(int[] arr)
    {
        int max = arr[0];
        for(int x=1; x<arr.length; x++)
        {
            if(arr[x]>max)
                max = arr[x];
        }

        return max;
    }
    /**
    ��int������д�С�򵽵�����
    @param arr ���ڽ���һ��int���͵����顣
    */
    public static void bubbleSort(int[] arr)
    {
    }
}
