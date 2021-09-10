package com.canerture.newsappfragment.utils

import androidx.fragment.app.FragmentManager
import com.canerture.newsappfragment.R
import com.canerture.newsappfragment.entity.NewsModel
import com.canerture.newsappfragment.fragments.ScienceNewsFragment
import com.canerture.newsappfragment.fragments.SportsNewsFragment
import com.canerture.newsappfragment.fragments.TechnologyNewsFragment
import com.canerture.newsappfragment.fragments.TopNewsFragment

const val NEWSDATA = "newsdata"

object FragmentUtils {

    fun drawFragments(supportFragmentManager: FragmentManager) {

        val fragments = arrayListOf(topNewsFragment, techFragment1, techFragment2, techFragment3, techFragment4, scienceFragment1, scienceFragment2, scienceFragment3, scienceFragment4, scienceFragment5, sportsFragment1, sportsFragment2, sportsFragment3, sportsFragment4, sportsFragment5)
        val container = arrayListOf(R.id.topFrame, R.id.techFrame1, R.id.techFrame2, R.id.techFrame3, R.id.techFrame4, R.id.scienceFrame, R.id.scienceFrame2, R.id.scienceFrame3, R.id.scienceFrame4, R.id.scienceFrame5, R.id.sportsFrame, R.id.sportsFrame2, R.id.sportsFrame3, R.id.sportsFrame4, R.id.sportsFrame5)

        for (i in 0 until fragments.size) {
            supportFragmentManager.beginTransaction().add(container[i], fragments[i]).commit()
        }
    }

    fun removeFragments(supportFragmentManager: FragmentManager) {

        val fragments = arrayListOf(topNewsFragment, techFragment1, techFragment2, techFragment3, techFragment4, scienceFragment1, scienceFragment2, scienceFragment3, scienceFragment4, scienceFragment5, sportsFragment1, sportsFragment2, sportsFragment3, sportsFragment4, sportsFragment5)

        for (i in 0 until fragments.size) {
            supportFragmentManager.beginTransaction().remove(fragments[i]).commit()
        }
    }

    val topNewsFragment = TopNewsFragment.topNewsInstance(NewsModel(
        "https://i.gadgets360cdn.com/large/google_balloons_reuters_1620969188279.jpg?downsize=950:*",
        "Google Developing Own Processor for Chrome OS Laptops and Tablets",
        "Google is reportedly developing its own CPUs for future Chromebooks and also tablets running Chrome OS. The tech giant may roll out the new central processors sometime in 2023. This comes after Google confirmed that it will be using to its own SoC called Tensor for its Pixel lineup starting this year with the Pixel 6 series. The company now looks to continue with the same strategy for its other hardware products. And upcoming Chrome OS devices can be expected to pack Google's in-house SoCs.\n" +
                "\n" +
                "A Nikkei Asia report citing sources claims that Google is working on its own central processors for Chrome OS running notebooks and tablets. The tech giant is increasing the efforts to develop its own chips similar to its global rivals like Apple that is pursuing the same strategy and shifting away from Intel CPUs for its MacBook devices. Apple has been using its own processors for its iPhone lineup for over a decade now. The report says that other companies like Amazon, Facebook, Microsoft, Tesla, Baidu, and Alibaba are all working on building their own semiconductors to power their cloud services and electronic products.\n" +
                "\n" +
                "Google's new chips are reportedly based on the chip blueprints of ARM, a UK-based company whose intellectual property is used in more than 90 percent of smartphones. Google sees in-house chip development key to their competitiveness, the report says. It is also ramping up efforts to build mobile processors for its Pixel smartphones. Google will use its own processors for the first time on the Pixel 6 and the Pixel 6 Pro expected to launch this fall.\n" +
                "\n" +
                "The report says that Google has asked suppliers for 50 percent more production capacity for the handsets compared with the pre-pandemic level in 2019. The Tensor SoC for Pixel phones was unveiled a while ago, and the tech giant is currently employing key talent from the chip industry to build its own silicon TPUs (tensor processing units). It is reported to have hired talent from its key suppliers including Intel, Qualcomm, and MediaTek."))

    val techFragment1 = TechnologyNewsFragment.techNewsInstance(NewsModel(
        "https://image.cnbcfm.com/api/v1/image/106886144-1621533938329-screen_shot_2021-05-20_at_15956_pm.png?v=1621534164&w=740&h=416",
        "Facebook’s Bosworth says glasses with cameras will be the norm in 10 years",
        "Facebook’s Andrew “Boz” Bosworth, who runs the company’s hardware business, said on Friday that the ability to take pictures will be a standard feature for glasses within a decade.\n" +
                "\n" +
                "Bosworth’s comments on his podcast came a day after the launch of Ray-Ban Stories, Facebook’s smart glasses collaboration with Luxottica. The Ray-Ban smart glasses can take photos and videos using small cameras at the press of a button or with a voice command.\n" +
                "\n" +
                "“I think in 10 years it’ll be like, ‘Of course. Why don’t your glasses take pictures? That’s just weird,’” Bosworth said. “It really has that opportunity to turn the corner on that and move things forward.”\n" +
                "\n" +
                "Bosworth was speaking in conversation with Rocco Basilico, EssilorLuxottica’s chief wearables officer.\n" +
                "\n" +
                "While they’re still niche products, smart glasses have come a long way in the tech industry.\n" +
                "\n" +
                "Google was the first of the big tech companies to introduce a product, unveiling Google Glass in 2012. Google Glass looked nothing like regular glasses. The device had no lenses and instead used a little prism to reflect augmented reality imagery in front of a user’s eye. The glasses also included a camera that could shoot photos and videos.\n" +
                "\n" +
                "Google Glass generated hefty backlash from critics, who were worried about invasion of privacy. Already, Facebook’s product is drawing similar skepticism from people who are concerned that the device doesn’t do enough to alert people when the camera is in use.\n" +
                "\n" +
                "Snap entered the market in 2016 with Spectacles, a plastic set of glasses that featured two noticeable cameras on either corner of the frames and could shoot photos and videos.\n" +
                "\n" +
                "Snap announced the fourth version of Spectacles in May. They feature displays with the lens of the glasses that place AR imagery over the real world from the view of the user. Snap has thus far limited the distribution of the latest Spectacles to a select group of social media content creators.\n" +
                "\n" +
                "Facebook’s Ray-Ban Stories don’t yet have AR capabilities, but the company is working on that for future products.\n" +
                "\n" +
                "For now, the company has fit a camera, speakers and microphone within several Ray-Ban models. And rather than purchasing an unfamiliar piece of hardware, consumers can buy an existing product and pay an extra \$100 to turn them into smart glasses."))

    val techFragment2 = TechnologyNewsFragment.techNewsInstance(NewsModel(
        "https://www.cnet.com/a/img/FiEN4pLQYjV4gOgPgXlM68ez9Yw=/1092x0/2021/09/04/5ccea684-0b44-4791-a800-0262a7291bf4/20210903-windows-11-microsoft-surface-laptop-01.jpg",
        "Windows 11 will tap into top speed on Intel's new Alder Lake chips",
        "Here's a good reason to upgrade to Windows 11: Your laptop won't be able to take advantage of the full range of speed and battery features in Intel's new Alder Lake processor without Microsoft's latest operating system.\n" +
                "\n" +
                "Windows 11 arrives on Oct. 5, the same time of year as the first PCs using Alder Lake, Intel's successor to its 11th Gen Core \"Tiger Lake\" chips. Microsoft adapted Windows 11 for Alder Lake's headline feature, a combination of performance and efficiency processing cores that maximize speed and battery life, respectively. Specifically, Windows taps into Intel's Thread Director hardware that scrutinizes computing tasks as they run to figure out which core makes the most sense for each task.\n" +
                "\n" +
                "Supporting Thread Director makes Windows smarter about overseeing the hundreds of computing processes, called threads, that modern computers run simultaneously. It's like a train system operator scheduling traffic better by knowing each train's speed and importance.\n" +
                "\n" +
                "\"The Windows 11 thread scheduler is much smarter about dynamically picking the most appropriate core,\" said Mehmet Iyigun, Microsoft's manager for partner development, in an August briefing. Such oversight offers a \"huge impact on perceived performance.\"\n" +
                "\n" +
                "Microsoft didn't comment on how significant the benefits from Thread Director would be. \n" +
                "\n" +
                "The speed and efficiency boosts provided by the combination of Windows 11 and Alder Lake could prompt an upgrade cycle for both businesses, which are often reluctant to roll out upgrades, and consumers, who can hang on to laptops until a big advance in technology arrives.\n" +
                "\n" +
                "The lure of performance enhancements could help Microsoft coax reluctant customers to upgrade Windows instead of letting old versions linger for years. The long lifespans of Windows XP and Windows 7 in past decades brought problems like unpatched security vulnerabilities and incompatibility with new software.\n" +
                "\n" +
                "If you have a work-supplied laptop, your employer's tech decisions affect you, and better performance and battery life are benefits any IT manager can appreciate.\n" +
                "\n" +
                "\"In the enterprise, [Thread Director support] could be an accelerator for Windows 11 adoption,\" Techsponential analyst Avi Greengart said. Businesses also might like Windows 11's security, management and productivity improvements, he added.\n" +
                "\n" +
                "Based on its observations, Thread Director provides advice to the operating system about which tasks are high priorities for the performance cores and which are lower priority background tasks that can be assigned to efficiency cores. It reassess its conclusions with changes like new tasks arriving or an older task finishing.\n" +
                "\n" +
                "Windows 11 also improves how software installed on a computer communicates its needs to the operating system, allowing for enhanced performance. Windows already had a programming interface that software could use to request more resources for better performance. In Windows 11, software can now say when it wants to go easy on your battery, preferring efficiency over performance.\n" +
                "\n" +
                "One app that'll take advantage of the efficiency option is Microsoft's own Edge browser, Iyigun said.\n" +
                "\n" +
                "Intel is working with Linux programmers to add Thread Director support to that operating system, the company said."))

    val techFragment3 = TechnologyNewsFragment.techNewsInstance(NewsModel(
        "https://image.cnbcfm.com/api/v1/image/106933213-16299171932021-08-25t184429z_1531040530_rc2icp9co1go_rtrmadp_0_usa-cyber-biden.jpeg?v=1629917258&w=740&h=416",
        "Epic Games failed to prove Apple is a monopolist, rules judge",
        "A federal judge in California ruled Friday that Epic Games failed to prove that Apple is a monopolist.\n" +
                "\n" +
                "But she left open the possibility that Apple’s alleged monopoly status could be proven.\n" +
                "\n" +
                "“While the Court finds that Apple enjoys considerable market share of over 55% and extraordinarily high profit margins, these factors alone do not show antitrust conduct. Success is not illegal,” U.S. District Judge Yvonne Gonzalez Rogers wrote.\n" +
                "\n" +
                "“The final trial record did not include evidence of other critical factors, such as barriers to entry and conduct decreasing output or decreasing innovation in the relevant market,” she wrote. “The Court does not find that it is impossible; only that Epic Games failed in its burden to demonstrate Apple is an illegal monopolist.”\n" +
                "\n" +
                "That’s an important development for other parties that may be considering legal action against Apple on antitrust grounds. Politico reported earlier this week that the Department of Justice was waiting on the Epic Games decision to decide how to move forward in its own investigation into Apple.\n" +
                "\n" +
                "On the one hand, the ruling could be discouraging to DOJ prosecutors, state attorneys general or private parties who may be considering legal action. But on the other, it invites the chance for more evidence to sway a court’s opinion on Apple’s alleged monopoly power.\n" +
                "\n" +
                "The judge did hand Epic a partial win, ruling that Apple engaged in anticompetitive conduct by failing to allow developers to notify their customers directly of their own payment mechanisms to use instead of Apple’s. She ordered Apple to allow developers to include external links to their own tools in addition to Apple’s in-app purchasing mechanism.\n" +
                "\n" +
                "That remedy could alleviate some of the most pressing concerns developers have raised with Apple’s model. As app makers have become more outspoken over the past couple of years about Apple’s practices, the company has slowly adjusted its policies, which could eventually make further legal action against the company less attractive to regulators and competitors relying on their services."))

    val techFragment4 = TechnologyNewsFragment.techNewsInstance(NewsModel(
        "https://image.cnbcfm.com/api/v1/image/106939177-1631189007613amazon-omni-series-tv-2.PNG?v=1631189047&w=740&h=416",
        "Amazon TVs are coming in October, with prices starting at $370",
        "Amazon announced Thursday its first branded TV sets.\n" +
                "\n" +
                "There will be two versions — the high-end Amazon Fire TV Omni Series and the more affordable Amazon Fire TV 4-Series — each available in different sizes. They go on sale in October at prices ranging from \$369.99 to \$1,099.99.\n" +
                "\n" +
                "Until now, Amazon has sold streaming sticks that plug into TVs, and has worked with other manufacturers, like Toshiba and Insignia in the U.S., to build TV sets with its own Amazon Fire interface, which offers voice control and easy access to Amazon Prime video and other streaming services.\n" +
                "\n" +
                "Competitors like Roku and Google have followed a similar path with plug-in sticks and third-party manufacturers.\n" +
                "\n" +
                "But Amazon is the first of those to launch its own TV.\n" +
                "\n" +
                "The company told CNBC in a briefing it wanted to build its own set to better integrate its Fire TV software with Alexa voice controls. The move also gives Amazon the power to set its own prices, which means it could undercut competitors the way it does with its Fire tablets, which sell for a fraction of the price of Apple’s iPads.\n" +
                "\n" +
                "Plus, it can control the experience to give users its “frustration-free” set-up. Open the box, turn the TV on, and as long as you’ve connected any Amazon device to your Wi-Fi before, it will automatically connect to your home network.\n" +
                "\n" +
                "Amazon said it will offer an update later this year that lets customers control smart devices around their home, like lights, cameras and thermostats, using a software dashboard that appears on the TV.\n" +
                "\n" +
                "The TVs will be sold on Amazon’s website and through Best Buy. All of them support 4K video.\n" +
                "\n" +
                "Here’s what you need to know about the two versions.\n" +
                "\n" +
                "Amazon Fire TV Omni Series\n" +
                "The higher-end Amazon Fire TV Omni Series will ship in five sizes: 43 inches (\$409.99), 50 inches (\$509.99), 55 inches (\$559.99), 65 inches (\$829.99) and 75 inches (\$1,099.99).\n" +
                "\n" +
                "Like the \$120 Fire TV Cube, you can speak to the TV without using a remote and ask it to play any TV show or movie, begin playing music, check the weather, control your smart home, view smart home cameras on your screen while watching TV, and more. You can talk to the TV from across the room, just as you can for Amazon’s Echo smart speakers. There’s a microphone switch under the bottom of the screen that lets you turn off the microphone. And you can add a webcam for video calls, including with new support for Zoom calls.\n" +
                "\n" +
                "The Fire TV Omni Series also supports Dolby Digital Plus audio for higher-end surround sound speakers you may already have at home. The Omni Series and 4-Series TVs can automatically detect Echo speakers in your home and let you use them as stereo or surround-sound TV speakers.\n" +
                "\n" +
                "The 65- and 75-inch versions have the best picture quality of Amazon’s new TVs, with support for brighter and more colorful Dolby Vision HDR.\n" +
                "\n" +
                "Amazon Fire TV 4-Series\n" +
                "Amazon’s Fire TV 4-Series TVs will be available in 43 inches (\$369.99), 50 inches (\$469.99) and 55 inches (\$519.99).\n" +
                "\n" +
                "They have bigger bezels around the edges than the Omni TVs, so they might not look as modern as the more expensive models, and you can’t add a webcam for video calls.\n" +
                "\n" +
                "The 4-Series TVs integrate with Alexa, but only if you tap the Alexa button on the voice remote -- you can’t just call across the room to speak to your TV as you might with the Omni series, but you can still ask Alexa to play certain movies, TV shows and more, or ask it things like sports scores and the weather, as you would with any Fire TV device.\n" +
                "\n" +
                "While the 4-Series TVs support high dynamic range standards like HLG and HDR10 for improved clarity in darker and brighter scenes, none offers Dolby Vision support like the highest-end Omni Series TVs."))

    val scienceFragment1 = ScienceNewsFragment.scienceNewsInstance(NewsModel(
        "https://www.sciencenews.org/wp-content/uploads/2021/09/091021_lg_percy-rocks_feat-1030x580.jpg",
        "NASA’s Perseverance rover snagged its first Martian rock samples",
        "The Perseverance rover has captured its first two slices of Mars. NASA’s latest Mars rover drilled into a flat rock nicknamed Rochette on September 1 and filled a roughly finger-sized tube with stone. The sample is the first ever destined to be sent back to Earth for further study. On September 7, the rover snagged a second sample from the same rock. Both are now stored in airtight tubes inside the rover’s body. Getting pairs of samples from every rock it drills is “a little bit of an insurance policy,” says deputy project scientist Katie Stack Morgan of NASA’s Jet Propulsion Lab in Pasadena, Calif. It means the rover can drop identical stores of samples in two different places, boosting chances that a future mission will be able to pick up at least one set. The successful drilling is a comeback story for Perseverance. The rover’s first attempt to take a bit of Mars ended with the sample crumbling to dust, leaving an empty tube (SN: 8/19/21). Scientists think that rock was too soft to hold up to the drill.\n" +
                "\n" +
                "“Even though some of its rocks are not, Mars is hard,” said Lori Glaze, director of NASA’s  planetary science division, in a September 10 news briefing. Rochette is a hard rock that appears to have been less severely eroded by millennia of Martian weather (SN: 7/14/20). (Fun fact: All the rocks Perseverance drills into will get names related to national parks; the region on Mars the rover is now exploring is called Mercantour, so the name Rochette — or “Little Rock”  — comes from a village in France near Mercantour National Park.) Rover measurements of the rock’s texture and chemistry suggests that it’s made of basalt and may have been part of an ancient lava flow. That’s useful because volcanic rocks preserve their ages well, Stack Morgan says. When scientists on Earth get their hands on the sample, they’ll be able to use the concentrations of certain elements and isotopes to figure out exactly how old the rock is — something that’s never been done for a pristine Martian rock. Rochette also contains salt minerals that probably formed when the rock interacted with water over long time periods. That could suggest groundwater moving through the Martian subsurface, maybe creating habitable environments within the rocks, Stack Morgan says. “It really feels like this rich treasure trove of information for when we get this sample back,” Stack Morgan says. Once a future mission brings the rocks back to Earth, scientists can search inside those salts for tiny fluid bubbles that might be trapped there. “That would give us a glimpse of Jezero crater at the time when it was wet and was able to sustain ancient Martian life,” said planetary scientist Yulia Goreva of JPL at the news briefing. Scientists will have to be patient, though — the earliest any samples will make it back to Earth is 2031. But it’s still a historic milestone, says planetary scientist Meenakshi Wadhwa of Arizona State University in Tempe. “These represent the beginning of Mars sample return,” said Wadhwa said at the news briefing. “I’ve dreamed of having samples back from Mars to analyze in my lab since I was a graduate student. We’ve talked about Mars sample return for decades. Now it’s starting to actually feel real.”"))

    val scienceFragment2 = ScienceNewsFragment.scienceNewsInstance(NewsModel(
        "https://www.sciencenews.org/wp-content/uploads/2021/08/082721_eg_covid-hospitalizations_feat-1030x580.jpg",
        "These charts show that COVID-19 vaccines are doing their job",
        "As the coronavirus continues to surge across the United States, hospitals are again filling up with ill COVID-19 patients. And the vast majority of those patients are unvaccinated, as two new charts help make exceedingly clear. One of those charts shows that from January 24 to July 24, vaccinated individuals were hospitalized with COVID-19 at a much lower cumulative rate than unvaccinated individuals. And the difference in rates between the two groups has only grown over time. By late July, a total of about 26 adults per 100,000 vaccinated people had been hospitalized for COVID-19. That’s compared with about 431 hospitalized people for every 100,000 unvaccinated individuals — a rate roughly 17 times as high as for those who were vaccinated. The data come from 13 states, including California, Georgia and Utah.\n" +
                "\n" +
                "That trend held when the researchers charted hospitalization rates on a weekly basis too. From January to July, weekly hospitalization rates among unvaccinated people were six to 31 times as high as those in vaccinated people, the researchers report August 29 at medRxiv.org. The accumulation of hospitalizations in each group over time, which that first chart shows, illustrates the risk of developing severe COVID-19 overall. And its message is clear: If you’re vaccinated during this pandemic, your risk of hospitalization is much, much lower than if you’re not vaccinated. The weekly rate, on the other hand, is a bit like the speedometer on a car — providing a glimpse of what’s happening week by week as the coronavirus spreads. Its message is also clear: The risk of a vaccinated person becoming hospitalized remains low at any given time, while the risk for unvaccinated people can fluctuate, probably as a result of community transmission."))

    val scienceFragment3 = ScienceNewsFragment.scienceNewsInstance(NewsModel(
        "https://www.sciencenews.org/wp-content/uploads/2021/09/081321_aa_50ya-chemical-pollution_feat-1030x580.jpg",
        "50 years ago, chemical pollutants were linked to odd animal behavior",
        "For fish and other underwater life, a sensitivity to chemicals plays the same role as the sense of smell does for land animals.… [Researchers] have been studying the subtle ways this delicate fish-communication system can be disrupted by pollutants…. One study examined the effects of kerosene pollution on the behavior of lobsters…. The experiments demonstrate that chemical communication interference takes place at extremely low dilutions.\n" +
                "\n" +
                "Update\n" +
                "Chemical pollution — from sewage and agricultural runoff to pharmaceutical waste — muddles aquatic animals’ senses with potentially dire effects, decades of research has shown. A chemical used to treat sewage seems to limit some fish species’ abilities to form schools, making the fish vulnerable to predators (SN: 10/27/07, p. 262). Drug-tainted waters can have a variety of effects on fish, including suppressing their appetites (SN: 12/20/08, p. 15). A plastic chemical also appears to confuse senses: Its scent can lure sea turtles into eating plastic debris (SN: 3/28/20, p. 14)."))

    val scienceFragment4 = ScienceNewsFragment.scienceNewsInstance(NewsModel(
        "https://www.sciencenews.org/wp-content/uploads/2021/09/090221_rc_wildfire-smoke_feat-1030x580.jpg",
        "Clouds affected by wildfire smoke may produce less rain",
        "When smoke rises from wildfires in the western United States, it pummels clouds with tiny airborne particles. What happens next with these clouds has been largely unstudied. But during the 2018 wildfire season, researchers embarked on a series of seven research flights, including over the Pacific Northwest, to help fill this gap.\n" +
                "\n" +
                "Using airborne instruments to analyze small cumulus clouds affected by the smoke, the scientists found that these clouds contained, on average, five times as many water droplets as unaffected clouds. That in itself was not a huge surprise; it’s known that organic and inorganic particles in smoke can serve as tiny nuclei for forming droplets (SN: 12/15/20). But the sheer abundance of droplets in the affected clouds astounded the team. \n" +
                "\n" +
                "Counterintuitively, those numerous droplets didn’t make the clouds more likely to produce rain. In fact, the opposite occurred. Because the droplets were about half as big as those found in a typical cloud, they were unlikely to collide and merge with enough other droplets to result in rain. The chances of rain were “virtually zero,” the researchers write in the August Geophysical Research Letters.\n" +
                "\n" +
                "The new research suggests that wildfires could lead to clouds producing less rain in the U.S. West, feeding into drought conditions and potentially increasing future wildfire risk.\n" +
                "\n" +
                "But the environmental dynamics involved are complex, says Cynthia Twohy. She’s a San Diego–based atmospheric scientist at NorthWest Research Associates, a research organization specializing in geophysical and space sciences headquartered in Redmond, Wash. For instance, Twohy and her colleagues found that “the ratio of light-absorbing to light-scattering particles in the smoke was somewhat lower than measured in many prior studies,” she says.  \n" +
                "\n" +
                "“The take-home message is that while other studies have shown wildfire smoke has an absorbing (warming) influence that can be important for cloud formation and development, these impacts may be less in the western U.S., because the smoke is not as dark,” Twohy says. The impact of the lighter smoke is still an open question. “It’s just another way that smoke-cloud interactions are a wild card in the region.”  \n" +
                "\n" +
                "The team used onboard probes to sample clouds affected by wildfire smoke and compare them to their more pristine counterparts. The probes measured how many cloud droplets were present in the samples, the size range of those droplets and the liquid water content of the clouds.\n" +
                "\n" +
                "A special tube mounted on the exterior of the plane to collect and evaporate cloud droplets was used to “reveal the particles that the droplets were condensed on,” says Robert Yokelson, an atmospheric chemist at the University of Montana in Missoula who was not involved with the research. This process enabled the researchers to confirm what the original smoke particles were made of, a technique that Yokelson calls “neat.”\n" +
                "\n" +
                "The analysis detected the amounts of carbon, oxygen, nitrogen, sulfur and potassium found in residual particles evaporated from cloud droplets. These elements were present in similar amounts to those found in smoke particles sampled from below the clouds, “implying that the cloud droplets also formed on smoke particles,” Twohy says.\n" +
                "\n" +
                "Previous studies conducted in the Amazon have shown that “smoke will make the cloud droplets smaller and more numerous,” thereby reducing rainfall, Yokelson says. But this study provides robust evidence that the phenomenon isn’t isolated to the Amazon. It echoes the results of a much smaller 1974 study of smoke-filled clouds over the western United States, providing a crucial present-day snapshot of the challenges facing the region.\n" +
                "\n" +
                "Wildfires in the western United States have been breaking records in recent years — increasing in number and size due to climate change — a trend that scientists think will get worse as the globe continues to warm (SN: 12/21/20). As a result, Twohy says, it’s increasingly important that researchers continue to monitor these fires’ influence on the atmosphere."))

    val scienceFragment5 = ScienceNewsFragment.scienceNewsInstance(NewsModel(
        "https://www.sciencenews.org/wp-content/uploads/2021/05/050621_EC_pasta_feat.jpg",
        "Morphing noodles start flat but bend into curly pasta shapes as they’re cooked",
        "When imprinted with carefully designed arrangements of grooves, flat pasta morphs as it cooks, forming tubes, spirals and other shapes traditional for the starchy sustenance. The technique could allow for pasta that takes up less space, Lining Yao and colleagues report May 5 in Science Advances.\n" +
                "\n" +
                "Pasta aficionados “are very picky about the shapes of pasta and how they pair with different sauces,” says Yao, who studies the design of smart materials at Carnegie Mellon University in Pittsburgh. But those shapes come at a cost of excess packaging and inefficient shipping: For some varieties of curly pasta, more than 60 percent of the packaging space is used to hold air, the researchers calculated.\n" +
                "\n" +
                "Yao and colleagues stamped a series of grooves onto one side of each noodle. As the pasta absorbed water during cooking, the liquid couldn’t penetrate as fully on the grooved side, causing it to swell less than the smooth side of the pasta. That asymmetric swelling bent the previously flat noodle into a curve. By changing the arrangement of the grooves, the researchers controlled the final shape. Computer simulations of swelling pasta replicated the shapes seen in the experiments.\n" +
                "\n" +
                "The technique isn’t limited to pasta: Another series of experiments, performed with silicone rubber in a solvent, produced similar results. But whereas the pasta held its curved shape, the silicone rubber eventually absorbed enough solvent to flatten out again. The gluey nature of cooked pasta helps lock in the twists by fusing neighboring grooves together, the researchers determined. Removing the silicone from the solvent caused the silicone to bend in the opposite direction. This reversible bending process could be harnessed for other purposes, such as a grabber for robot hands, Yao says.\n" +
                "\n" +
                "The pasta makes particularly good camping food, Yao says. A member of her team brought it along on a recent hiking trip. The pasta slips easily into a cramped pack but cooks into a satisfying shape."))

    val sportsFragment1 = SportsNewsFragment.sportsNewsInstance(NewsModel(
        "https://static.euronews.com/articles/stories/06/02/61/18/773x435_cmsv2_11c8bfc1-f265-5a0f-b836-18103a9723fd-6026118.jpg",
        "Portugal's Cristiano Ronaldo breaks men's international goalscoring record",
        "Cristiano Ronaldo has become the highest-scoring man in international football history with 111 goals. The Portugal captain entered Wednesday's World Cup qualifier on 109 goals, level with former Iranian striker Ali Daei. But Ronaldo moved ahead of Daei when he headed Portugal level in the 89th minute of their match against the Republic of Ireland. And minutes later, the Portuguese striker scored another header for his 111th goal to secure a 2-1 victory.36-year-old Ronaldo reached the record-breaking tally in his 180th game for Portugal, after making his international debut in 2003. In contrast, Daei scored 109 goals for Iran in 149 games between 1993 and 2006. The two men are the only male players to score more than 100 times for their countries. The international record is held by 38-year-old Canadian striker Christine Sinclair, who scored her 187th international goal en route to winning gold at the Tokyo Olympics last month. Ronaldo, whose only title with Portugal came at UEFA Euro 2016, was the top scorer at this year’s European Championship with five goals. He also became the first player to score in five different editions of the tournament, overtaking the record set by French striker Michel Platini. Ronaldo is the top scorer in the history of the UEFA Champions League with 134 goals — 14 more than Lionel Messi. He might have broken the international scoring record earlier on Wednesday but had a 15th-minute penalty saved. \"I’m very happy, not only because I beat the record but for the special moments that we had,Ronaldo said after the game. Two goals at the end of the game is so tough, but I have to appreciate what the team did. We believed until the end."))

    val sportsFragment2 = SportsNewsFragment.sportsNewsInstance(NewsModel(
        "https://static.euronews.com/articles/stories/06/01/23/42/773x435_cmsv2_9b02bb1a-6140-57c9-bc36-82e639f79c71-6012342.jpg",
        "Who is playing who in this year's Europa League?",
        "English FA Cup winners Leicester City will face Napoli of Italy in the Group Stage of this season's UEFA Europa League. Russian side Lokomotiv Moscow and Polish champions Legia Warsaw were also drawn into Group C. Elsewhere, West Ham United will face Dinamo Zagreb, Genk, and Rapid Vienna, while the 2018 Europa League runners-up Marseille will have to play Lokomotiv Moscow, Lazio, and Galatasaray. Scottish champions Rangers have been drawn against Olympique Lyonnais, Sparta Prague, and Brøndby, while Glasgow rivals Celtic face Bayer Leverkusen, Real Betis, and Ferencvaros. The 2022 Europa League final will take place in the Ramón Sánchez Pizjuán Stadium in Sevilla on 18 May. Before the draw, Villarreal's Spanish forward Gerard Moreno was voted Europa League Player of the Season for 2020-21. Here is the draw in full:\n" +
                "\n" +
                "Group A\n" +
                "-Olympique Lyonnais (France)\n" +
                "-Rangers (Scotland)\n" +
                "-Sparta Praha (Czech Republic)\n" +
                "-Brøndby (Denmark)\n" +
                "\n" +
                "Group B\n" +
                "-AS Monaco (France)\n" +
                "-PSV Eindhoven (Netherlands)\n" +
                "-Real Sociedad (Spain)\n" +
                "-Sturm Graz (Austria)\n" +
                "\n" +
                "Group C\n" +
                "-Napoli (Italy)\n" +
                "-Leicester City (England)\n" +
                "-Spartak Moskva (Russia)\n" +
                "-Legia Warszawa (Poland)\n" +
                "\n" +
                "Group D\n" +
                "-Olympiacos (Greece)\n" +
                "-Eintracht Frankfurt (Germany)\n" +
                "\uFEFF-Fenerbahçe (Turkey)\n" +
                "-Royal Antwerp (Belgium)\n" +
                "\n" +
                "Group E\n" +
                "-Lazio (Italy)\n" +
                "-Lokomotiv Moskva (Russia)\n" +
                "-Olympique Marseille (France)\n" +
                "-Galatasaray (Turkey)\n" +
                "\n" +
                "Group F\n" +
                "-SC Braga (Portugal)\n" +
                "-Crvena Zvezda (Serbia)\n" +
                "-Ludogorets (Bulgaria)\n" +
                "-Midtjylland (Denmark)\n" +
                "\n" +
                "Group G\n" +
                "-Bayer Leverkusen (Germany)\n" +
                "-Celtic (Scotland)\n" +
                "-Real Betis (Spain)\n" +
                "-Ferencváros (Hungary)\n" +
                "\n" +
                "Group H\n" +
                "-GNK Dinamo (Croatia)\n" +
                "-Genk (Belgium)\n" +
                "-West Ham United (England)\n" +
                "-Rapid Wien (Austria)"))

    val sportsFragment3 = SportsNewsFragment.sportsNewsInstance(NewsModel(
        "https://static.euronews.com/articles/stories/05/99/19/88/773x435_cmsv2_882fc1b7-7e0a-515d-975e-642793414295-5991988.jpg",
        "'€1.35 billion': Barcelona President reveals extent of Spanish club's rising debt",
        "The debt of Spanish football giants Barcelona has risen to €1.35 billion, the club's president has revealed. Joan Laporta confirmed that the club had losses in 2020-21 of €481 million and was left with a negative net worth of €451 million. Laporta blamed the club's previous administration for the \"dramatic\" and \"complicated\" situation that made it difficult for Barcelona to negotiate with players and ultimately led to the departure of Lionel Messi. 'Our salaries represent 103% of the club's total income, that's 20% to 25% more than our competitors,' Laporta said in a news conference on Monday. While presenting the club's dire financial situation, Laporta accused his predecessor Josep Bartomeu of countless 'lies' and stated that he and his board of directors must be held accountable. Bartomeu resigned last year amid financial struggles, but recently published a letter in which he denied any wrongdoing during his administration.\n" +
                "\n" +
                "Nearly €390 million of Barcelona's debt is related to player salaries, while more than €670 million was debts with banks, and another €40 million was linked to membership losses. The impact of the COVID-19 pandemic was also €91 million, Laporta said. 'We have found ourselves in a difficult situation to renegotiate the players' contracts,' he told reporters but said that the situation would be resolved within a few years. 'We are not scared at all, we are highly motivated. It's a big challenge but we are capable of overcoming it. 'Laporta said the club intends to reduce salaries by about €200 million and focus on promoting youth players. This summer, Barcelona signed a number of high-profile free agents, including Sergio Aguero, Memphis Depay, and Eric Garcia. But the club lost star player Messi to Paris Saint-Germain because it could not give him a new contract that would fit within the Spanish league's strict financial fair-play regulations.\n" +
                "\n" +
                "Barcelona defender Gerard Piqué said on Sunday that he had taken a salary reduction to allow the club to register some of its new players ahead of their first game against Real Sociedad. Other veteran players such as Sergio Busquets, Jordi Alba, and Sergi Roberto were expected to do the same. 'We are satisfied to have resolved this issue with Piqué and we hope that other captains will act along the same lines, the negotiations are going well,' Laporta said on Monday. 'We will soon reach the agreements we want to reach. 'Despite Barcelona winning their first match 4-2, Laporta was the target of fans' anger on Sunday, with banners hung outside the Camp Nou stadium criticising him for not doing enough to keep Messi. Laporta confirmed to reporters that the Argentine player's departure was 'sad' but 'necessary'. 'We are convinced that the right decisions have been taken ... the institution is above all,' he said."))

    val sportsFragment4 = SportsNewsFragment.sportsNewsInstance(NewsModel(
        "https://static.euronews.com/articles/stories/05/97/00/38/773x435_cmsv2_3e587d4e-3831-53a7-a3e8-8954464f6963-5970038.jpg",
        "Last day at the Olympics: France takes both handball gold medals",
        "It's the last day at the Tokyo Olympics and it's another strong day for team sports and on the cycling tracks. After 17 days of the world's 11,000 best athletes battling it out, the closing ceremony will call time on the games at 13:00 CEST. Here's a recap of who won what on the last day.\n" +
                "\n" +
                "Handball\n" +
                "France's women's team secured their first-ever Olympic title, beating the team from Russia 30-25. Scores were level at 16-16 midway through the second half before six straight goals for France and a string of saves by goalkeeper Cleopatre Darleux took the game out of the Russians’ reach. France’s Pauletta Foppa and Allison Pineau had seven goals each, and so did Russian player Polina Vedekhina. France also won the men’s tournament in Saturday’s final against Denmark and becomes the first country to win both handball events at the same Olympics since Yugoslavia in 1984. Norway matched its women’s bronze from 2016 with a commanding 36-19 win over Sweden.\n" +
                "\n" +
                "Men's marathon\n" +
                "Eliud Kipchoge pulled away late and no one could come close to catching him as the 36-year-old from Kenya defended his Olympic marathon title. Kipchoge finished in 2 hours, 8 minutes, 38 seconds on a breezy and humid Sunday along the streets of Sapporo. It was more than 80 seconds ahead of runner-up Abdi Nageeye of the Netherlands. Bashir Abdi of Belgium earned bronze to close out the track and field portion of the Tokyo Games. Kipchoge smiled along the way and even fist-bumped a fellow racer. Kipchoge becomes the third athlete to win multiple gold medals in the men’s marathon, joining Abebe Bikila (1960, ’64) and Waldemar Cierpinski (’76, ’80).\n" +
                "\n" +
                "Boxing\n" +
                "Andy Cruz has won Cuba’s fourth boxing gold medal at the Tokyo Olympics, beating U.S. lightweight Keyshawn Davis 4:1 in the final. Cruz beat Davis for the fourth consecutive time in their amateur careers, but he had to rally with an impressive third round after Davis swept the second on all five judges’ cards. Armenia’s Hovhannes Bachkov and Australia’s Harry Garside won the bronze medals. Kellie Anne Harrington of Ireland has won gold in the women’s lightweight division, beating Beatriz Ferreira of Brazil 5:0 in a close bout. Harrington is a 31-year-old career amateur who spent the past half-decade waiting for her shot to follow in the footsteps of Katie Taylor, who won gold for Ireland at the inaugural women’s Olympic boxing tournament in London. Finland’s Mira Potkonen and Thailand’s Sudaporn Seesondee won bronze. Lauren Price of Britain has won gold in the women’s middleweight division, beating China’s Li Qian 5:0 in a one-sided bout. Price claimed Britain’s second gold medal and sixth medal overall in Tokyo with a solid performance against Li. Price is the first woman to win gold at middleweight after Claressa Shields, the American two-time champion. Nouchka Fontijn of the Netherlands and Zemfira Magomedalieva won bronze. Bakhodir Jalolov of Uzbekistan has won gold at super heavyweight in the final boxing match of the Tokyo Olympics, dominating a 5:0 victory over Richard Torrez Jr. of the United States. Torrez claimed the third silver for the U.S., which had its most successful Olympics since 2000 in terms of total medals. Frazer Clarke of Britain and Kazakh Kamshybek Kunkabayev won bronze.\n" +
                "\n" +
                "Volleyball\n" +
                "The United States won its first Olympic gold medal ever in women’s volleyball by beating Brazil in straight sets. The U.S. had won silver three times and bronze twice previously for the most medals by any country that hadn’t won gold. But the Americans finally completed that quest by beating the country that denied them gold in the final match in both 2008 and 2012. Serbia beat South Korea for the bronze medal.\n" +
                "\n" +
                "Water polo\n" +
                "Filip Filipovic and Serbia have won their second straight gold medal in men’s water polo, beating Greece 13-10 in the final event of the Tokyo Olympics. Serbia finished third in Group B, but it raised its game to another level when the quarterfinals rolled around — just like it did when it won gold in 2016. Serbia became the first country to repeat as Olympic champion since Hungary won three in a row from 2000 to 2008. It earned its fourth medal in its fourth appearance in the Olympics’ oldest team sport. Greece also matched the country’s best result in a team sport at the Olympics, joining a silver medal in women’s water polo at the Athens Games. Hungary has won the bronze medal in men’s water polo, topping Spain 9-5.\n" +
                "\n" +
                "Basketball\n" +
                "The United States won its seventh straight gold medal in women’s basketball, beating Japan 90-75. A’ja Wilson added 19 points and Breanna Stewart scored 14 as the Americans dominated inside again. The U.S. extended its Olympic winning streak to 55 consecutive games dating to the 1992 bronze medal game. Japan finished with the silver in the host nation’s first appearance in the medal round. Japan finished eighth at the 2016 Rio de Janeiro Games."))

    val sportsFragment5 = SportsNewsFragment.sportsNewsInstance(NewsModel(
        "https://static.euronews.com/articles/stories/06/02/74/16/773x435_cmsv2_2c9d0437-50b0-51ea-a17e-07604e2b6a78-6027416.jpg",
        "FIFA will take action over racist abuse of England players by Hungary fans",
        "Football's world governing body announced on Friday that it has opened disciplinary proceedings over the racist abuse of England players during a World Cup qualifier match against Hungary the previous evening. \"Following analysis of the match reports, FIFA has opened disciplinary proceedings concerning the incidents last night at the game Hungary-England,\" the body said in a statement. \"Once again, FIFA would like to state that our position remains firm and resolute in rejecting any form of racism and violence as well as any other form of discrimination or abuse. We have a very clear zero-tolerance stance against such abhorrent behaviour in football,\" it added. The announcement comes hours after British Prime Minister Boris Johnson called for \"strong action\" from FIFA, describing the racist abuse directed at England players as \"completely unacceptable\". \"I urge FIFA to take strong action against those responsible to ensure that this kind of disgraceful behaviour is eradicated from the game for good,\" he added.\n" +
                "\n" +
                "The Three Lions were jeered for taking a knee before the start of the game — a gesture denouncing racism — and were pelted with plastic cups after goals. Players of colour were also reportedly harassed with monkey noises throughout the match. England manager Gareth Southgate said after the clash — which ended in a 4-0 victory for England — that his players, including 18-year-old Jude Bellingham, \"should not have to endure this suffering\". He added that he had not personally seen the racist abuse and that he did not believe that all Hungarian fans were involved — but that those who were should not be excused. Garreth was pelted with ice during his interview. England's Football Association described it as \"extremely disappointing to hear reports of discriminatory actions towards some of our England players.\"\"We will be asking FIFA to investigate the matter,\" It added.\n" +
                "\n" +
                "The Hungarian Football Association (MLSZ) said on Friday that \"the vast majority of the 60,000 fans visiting the Puskas Arena were sporting, encouraging the Hungarian national team, even when the team was already losing.\" \"It is in their defense that the disruptors need to be identified and severely punished.\" \"Fans entering the field, throwing light grenades and glasses, are being identified. The MLSZ has filed/will file a police report against them. Any fine will be passed on to the perpetrators in civil litigation, and they can expect a two-year disqualification from sporting events at the end of the trial,\" it added in a statement. Marco Rossi, who manages the Hungarian national team, had urged supporters not to behave that way before the match. Hungary had been ordered to play its next two matches in front of an empty stadium by the UEFA — Europe's governing body for football — following this summer's Euro championships because of racist and homophobic abuse observed during games held in Budapest.\n" +
                "\n" +
                "But supporters were allowed in the stands on Thursday evening because the European qualifying matches for next year's World Cup in Qatar, fall under FIFA's jurisdiction and not the UEFA's. Hungarian Foreign Minister Péter Szijjártó seemingly dismissed accusations lobbed at his country's supporters on Friday morning, sharing a video in a Facebook post and writing: \"English players complain about the \"hostile atmosphere in Budapest yesterday\". The following footage was taken at Wembley before the European Championship final. The Italian national anthem can barely be heard amidst the whistling of the England fans. Did they make similar statements then?\" Several black members of the England squad were subjected to serious online racist abuse by British fans following the Euro final, after missing their penalties which resulted in an Italian victory."))


}