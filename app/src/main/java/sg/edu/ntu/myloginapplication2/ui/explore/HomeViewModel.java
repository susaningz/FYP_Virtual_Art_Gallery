package sg.edu.ntu.myloginapplication2.ui.explore;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
//    private final MutableLiveData<>

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Explore");
    }

    public LiveData<String> getText() {
        return mText;
    }
}