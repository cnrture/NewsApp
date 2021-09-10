package com.canerture.newsappfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import androidx.activity.OnBackPressedCallback
import androidx.databinding.DataBindingUtil
import androidx.transition.*
import com.canerture.newsappfragment.R
import com.canerture.newsappfragment.entity.NewsModel
import com.canerture.newsappfragment.databinding.FragmentDetailBinding
import com.canerture.newsappfragment.utils.FragmentUtils
import com.canerture.newsappfragment.utils.NEWSDATA
import com.google.android.material.transition.MaterialFadeThrough
import com.squareup.picasso.Picasso

class DetailFragment : Fragment() {

    private var newsModel: NewsModel? = null

    private lateinit var binding: FragmentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {

                FragmentUtils.drawFragments(parentFragmentManager)
                parentFragmentManager.beginTransaction().remove(this@DetailFragment).commit()

            }
        }
        activity?.onBackPressedDispatcher?.addCallback(this, callback)

        arguments?.let {
            newsModel = it.getSerializable(NEWSDATA) as NewsModel?
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        exitTransition = MaterialFadeThrough().apply {
            duration = 500
        }

        Picasso.get().load(newsModel?.image).into(binding.detailImage)

        binding.newsModel = newsModel

    }

    companion object {

        @JvmStatic
        fun newInstance(newsModel: NewsModel) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(NEWSDATA, newsModel)
                }
            }
    }
}