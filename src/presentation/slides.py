import plotly.graph_objects as go


def dataset_distribution():
    categories = ['Incorrect Submissions', 'Correct Submissions', 'Educator Solution']
    values = [296, 3, 1]
    fig = go.Figure()
    sorted_pairs = sorted(zip(values, categories), reverse=True)
    sorted_values = [pair[0] for pair in sorted_pairs]
    sorted_categories = [pair[1] for pair in sorted_pairs]
    for idx, (cat, val) in enumerate(zip(sorted_categories, sorted_values)):
        text_settings = {
            'text': [f"<b>{val}</b>"],
            'textposition': 'inside',
            'insidetextanchor': 'middle',
            'textfont': dict(size=14, color='white')
        } if idx == 0 else {
            'text': None  # Disable text for other segments
        }
        fig.add_trace(go.Bar(
            x=[val],  # Value for the segment
            y=[""],  # Single y-axis label (empty to hide)
            orientation='h',  # Horizontal bar
            name=cat,  # Category name (for legend)
            **text_settings
        ))

    fig.update_layout(
        barmode='stack',
        showlegend=True,
        legend=dict(
            orientation='h',  # Horizontal legend
            yanchor='top',  # Anchor to bottom of chart
            y=-0.3,  # Position below chart
            xanchor='center',
            x=0.5  # Center horizontally
        ),
        plot_bgcolor='rgba(0,0,0,0)',  # Transparent plot area
        paper_bgcolor='rgba(0,0,0,0)',  # Transparent surrounding area
        height=230,
        yaxis=dict(showticklabels=True),  # Hide y-axis labels
        margin = dict(b=100)
    )

    # fig.show()
    fig.write_image('dataset.png', scale=2)


if __name__ == '__main__':
    dataset_distribution()
