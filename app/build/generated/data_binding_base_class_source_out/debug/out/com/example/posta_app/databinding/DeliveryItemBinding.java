// Generated by view binder compiler. Do not edit!
package com.example.posta_app.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.example.posta_app.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DeliveryItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView addressTextView;

  @NonNull
  public final TextView idTextView;

  @NonNull
  public final TextView phoneNumberTextView;

  @NonNull
  public final TextView recieverNameTextView;

  private DeliveryItemBinding(@NonNull CardView rootView, @NonNull TextView addressTextView,
      @NonNull TextView idTextView, @NonNull TextView phoneNumberTextView,
      @NonNull TextView recieverNameTextView) {
    this.rootView = rootView;
    this.addressTextView = addressTextView;
    this.idTextView = idTextView;
    this.phoneNumberTextView = phoneNumberTextView;
    this.recieverNameTextView = recieverNameTextView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DeliveryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DeliveryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.delivery_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DeliveryItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address_textView;
      TextView addressTextView = rootView.findViewById(id);
      if (addressTextView == null) {
        break missingId;
      }

      id = R.id.id_textView;
      TextView idTextView = rootView.findViewById(id);
      if (idTextView == null) {
        break missingId;
      }

      id = R.id.phoneNumber_TextView;
      TextView phoneNumberTextView = rootView.findViewById(id);
      if (phoneNumberTextView == null) {
        break missingId;
      }

      id = R.id.recieverName_textView;
      TextView recieverNameTextView = rootView.findViewById(id);
      if (recieverNameTextView == null) {
        break missingId;
      }

      return new DeliveryItemBinding((CardView) rootView, addressTextView, idTextView,
          phoneNumberTextView, recieverNameTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
