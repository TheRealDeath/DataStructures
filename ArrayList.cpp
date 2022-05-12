#include <bits/stdc++.h>

template <typename T> class List
{
    protected:
        T* arr;
        int actualSize, arrSize, current;
        bool firstTry;
    public:
        List(T*)
        {
            arr = new T[0];
            size = arrSize = current = 0;
            firstTry = true;
        }
        int size()
        {
            using arrType = std::remove_reference<decltype( *arr )>::type;
            return sizeof(arr) / sizeof(arrType);
        }
        void resize()
        {
            T* temp;
            if(firstTry) {temp = new T[1];arrSize = 1;firstTry = false;}
            else
            {
                temp = new T[ceil(arrSize * 1.5)];
                for(int i = 0;i<actualSize;i++) temp[i] = arr[i];
            }
            arrSize = ceil(arrSize*1.5);
            arr = new T[arrSize];
            for(int i = 0;i<actualSize;i++) arr[i] = temp[i];
        }
        void add(T object)
        {
            if(arrSize <= actualSize) resize();
            arr[actualSize++] = object;
        }
        T pop(int n)
        {
            if(n >= actualSize) return false;
            for(int i = n+1;i<actualSize;i++) arr[i-1] = arr[i];
            arr[--actualSize] = NULL;
            return true;
        }
        T get(int n) {return arr[n];}
};
int main()
{
    List<std::string> list();
    list.add();
    
    return 0;
}
