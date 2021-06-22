// Generated by view binder compiler. Do not edit!
package com.example.posta_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.posta_app.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDeliveryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton addDelivery;

  @NonNull
  public final AutoCompleteTextView cityInput;

  @NonNull
  public final TextInputLayout cityLayout;

  @NonNull
  public final TextInputEditText nameInput;

  @NonNull
  public final TextInputLayout nameLayout;

  @NonNull
  public final TextInputEditText phoneNumberInput;

  @NonNull
  public final TextInputLayout phoneNumberLayout;

  private FragmentDeliveryBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton addDelivery, @NonNull AutoCompleteTextView cityInput,
      @NonNull TextInputLayout cityLayout, @NonNull TextInputEditText nameInput,
      @NonNull TextInputLayout nameLayout, @NonNull TextInputEditText phoneNumberInput,
      @NonNull TextInputLayout phoneNumberLayout) {
    this.rootView = rootView;
    this.addDelivery = addDelivery;
    this.cityInput = cityInput;
    this.cityLayout = cityLayout;
    this.nameInput = nameInput;
    this.nameLayout = nameLayout;
    this.phoneNumberInput = phoneNumberInput;
    this.phoneNumberLayout = phoneNumberLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDeliveryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDeliveryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_delivery, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDeliveryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addDelivery;
      AppCompatButton addDelivery = rootView.findViewById(id);
      if (addDelivery == null) {
        break missingId;
      }

      id = R.id.cityInput;
      AutoCompleteTextView cityInput = rootView.findViewById(id);
      if (cityInput == null) {
        break missingId;
      }

      id = R.id.cityLayout;
      TextInputLayout cityLayout = rootView.findViewById(id);
      if (cityLayout == null) {
        break missingId;
      }

      id = R.id.nameInput;
      TextInputEditText nameInput = rootView.findViewById(id);
      if (nameInput == null) {
        break missingId;
      }

      id = R.id.nameLayout;
      TextInputLayout nameLayout = rootView.findViewById(id);
      if (nameLayout == null) {
        break missingId;
      }

      id = R.id.phoneNumberInput;
      TextInputEditText phoneNumberInput = rootView.findViewById(id);
      if (phoneNumberInput == null) {
        break missingId;
      }

      id = R.id.phoneNumberLayout;
      TextInputLayout phoneNumberLayout = rootView.findViewById(id);
      if (phoneNumberLayout == null) {
        break missingId;
      }

      return new FragmentDeliveryBinding((ConstraintLayout) rootView, addDelivery, cityInput,
          cityLayout, nameInput, nameLayout, phoneNumberInput, phoneNumberLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
