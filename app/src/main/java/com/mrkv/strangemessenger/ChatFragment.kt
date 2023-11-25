package com.mrkv.strangemessenger

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chat, container, false)
        val messageList = MessageSource().loadMessages()
        recyclerView = view.findViewById(R.id.chat_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = ChatAdapter(messageList)
        return view
    }

    class ChatAdapter(private val messageList: List<Message>) : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var userImage: ImageView = itemView.findViewById(R.id.user_image_view)
            var chatMessage: TextView = itemView.findViewById(R.id.chat_message_textview)
            var dateMessage: TextView = itemView.findViewById(R.id.chat_date_textview)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.chat_item_view, parent, false)
            if (view.id == 0) {
                // TODO:  
            }
            return ViewHolder(view)
        }

        override fun getItemCount(): Int {
            return messageList.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val message = messageList[position]
            holder.userImage.setImageResource(R.drawable.user_image_1)
            holder.chatMessage.text = message.messageText
            holder.dateMessage.text = message.dateText

        }
    }
}