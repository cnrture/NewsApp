package com.canerture.newsappfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.canerture.newsappfragment.R
import com.canerture.newsappfragment.databinding.FragmentSportNewsBinding
import com.canerture.newsappfragment.entity.NewsModel
import com.canerture.newsappfragment.utils.FragmentUtils
import com.canerture.newsappfragment.utils.NEWSDATA
import com.squareup.picasso.Picasso

class SportsNewsFragment : Fragment() {

    private var newsModel: NewsModel? = null

    private lateinit var binding: FragmentSportNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            newsModel = it.getSerializable(NEWSDATA) as NewsModel
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sport_news, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.root.setOnClickListener {

            FragmentUtils.removeFragments(parentFragmentManager)

            val detailFragment = DetailFragment.newInstance(newsModel!!)

            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.topFrame, detailFragment).commit()

        }

        Picasso.get().load(newsModel?.image).into(binding.imageView)
        binding.newsModel = newsModel

    }

    companion object {

        @JvmStatic
        fun sportsNewsInstance(newsModel: NewsModel) =
            SportsNewsFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(NEWSDATA, newsModel)
                }
            }
    }
}