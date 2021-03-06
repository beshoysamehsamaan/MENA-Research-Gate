package com.maad.menaresearchgate.ui.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.maad.menaresearchgate.databinding.FragmentLoginBinding;
import com.maad.menaresearchgate.ui.activities.RegisterActivity;

public class LoginFragment extends Fragment {
    private int visibilityCounter = 0;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final FragmentLoginBinding loginBinding = FragmentLoginBinding.inflate(inflater, container, false);

        loginBinding.tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (visibilityCounter % 2 == 0) {
                    loginBinding.llResetContainer.setVisibility(View.VISIBLE);
                    ++visibilityCounter;
                } else {
                    loginBinding.llResetContainer.setVisibility(View.GONE);
                    ++visibilityCounter;
                }
            }
        });

        loginBinding.tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignupFragment signupFragment = new SignupFragment();
                ((RegisterActivity) getActivity()).openRegisterFragment(signupFragment);
            }
        });

        return loginBinding.getRoot();
    }
}
