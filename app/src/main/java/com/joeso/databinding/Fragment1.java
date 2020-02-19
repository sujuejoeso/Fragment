package com.joeso.databinding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.joeso.databinding.databinding.Fragment1Binding;

public class Fragment1 extends Fragment {
    private Fragment1Binding mBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        mBinding= DataBindingUtil.inflate(inflater, R.layout.fragment1, container, false);
        mBinding.setLifecycleOwner(this);
        return mBinding.getRoot();
    }
}
